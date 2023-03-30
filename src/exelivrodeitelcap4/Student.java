/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

/**
 *
 * @author Diogo
 */
// classe para manipular as notas de um aluno
public class Student {

    //variaveis de instancia
    private String name;
    private double average;

    //construtor que inicia as variaveis e valida a media
    public Student(String name, double average) {
        this.name = name;

        //valida a media entre 0 e 100. Caso contrário atribui valor 0.
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
            }
        }
    }

    //metodos setter's e getter's
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //define e valida a media
    public void setAverage(double average) {
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
            }
        }
    }

    public String getLetterGrade() {
        String letterGrade = "";
        if (average >= 90.0) {
            letterGrade = "A";
        } else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }

}
