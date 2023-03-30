/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
public class GradeBook {

    private String courseName; // nome do curso que esse livro de notas representa
    private int[] grades; //array de notas de aluno

    //construtor: Como esta classe será iniciada. Quais variáveis o usuario precisa fornecer para ser iniciada
    public GradeBook(String courseName, int[] grades) {

        this.courseName = courseName; //this chama a variável de classe, e lhe atribui o valor da variável do método
        this.grades = grades;

    }

    //metodos set e get
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    //metodo que realiza varias operacoes nos dados
    public void processGrades() {

        outputGrades();

        //chama metodo getAverage que calcula a nota media
        System.out.printf("%nClass average is %.2f%n", getAverage());

        //chama metodos getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %dn%n", getMinimum(), getMaximum());

        //chama outputBarChart para imprimir grafico de distribuicao de nota
        outputBarChart();
    }

    //metodo que localiza nota minima
    public int getMinimum() {
        int lowGrade = grades[0]; // supoe que grades[0] e a menor nota

        //faz loop pelo array de notas
        for (int grade : grades) {
            //faz loop pelo array e substitui se achamar uma nota mais baixa que grade[0]
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }
        return lowGrade;
    }

    //localiza nota maxima
    public int getMaximum() {

        int highGrade = grades[0]; // supoe que o primeiro indice do array e a maior nota
        //faz loop pelo array e substitui se encontrar uma nota maior que a anterior
        for (int grade : grades) {
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }
    //determina a media para o teste

    public double getAverage() {
        int total = 0;

        //soma notas do aluno
        for (int grade : grades) {
            total += grade;
        }

        //retorna media de notas
        return (double) total / grades.length;
    }

    //gera saida do grafico de barras exibindo a distribuicao de notas
    public void outputBarChart() {
        System.out.println("Grade distribution");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        //para cada nota incrementa a frequencia em +1;
        for (int grade : grades) {
            ++frequency[grade / 10];
        }
        //para cada frequencia de note imprime o grafico de barra
        for (int count = 0; count < frequency.length; count++) {
            //gera saida do rotulo de barras
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            //imprime a barra de asteriscos
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void outputGrades() {
        System.out.printf("The grades are: %n%n");
        //gera saida de nota de cada aluno
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);

        }
    }

}
