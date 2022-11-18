/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
public class Complex {

    private double parteReal;
    private double parteImaginaria;
    private static final double i = Math.sqrt(1);
    private String numExtenso;
    private double numTotal;

    //construtor da classe sem argumentos
    public Complex() {
        this.parteReal = 1;
        this.parteImaginaria = 1;
        numExtenso = (parteReal + "," + parteImaginaria);
        numTotal = (parteReal + (parteImaginaria * i));
    }

    //construtor da classe com argumentos para as 2 variaveis de instancia
    public Complex(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
        numExtenso = (parteReal + "," + parteImaginaria);
        numTotal = (parteReal + (parteImaginaria * i));
    }

    //Metodo que recebe dois objetos Complex e realiza soma deles
    public void SomaComplex(Complex obj1, Complex obj2) {

        this.parteReal = obj1.parteReal + obj2.parteReal;
        this.parteImaginaria = obj1.parteImaginaria + obj2.parteImaginaria;
    }

    //Metodo que recebe dois objetos Complex e realiza a subtracao entre eles
    public void SubtracaoComplex(Complex obj1, Complex obj2) {

        this.parteReal = obj1.parteReal - obj2.parteReal;
        this.parteImaginaria = obj1.parteImaginaria - obj2.parteImaginaria;
    }

    @Override
    public String toString() {

        return String.format("%.3f %s %.3f", this.parteReal, ",", this.parteImaginaria);
    }

    //metodo que retorna o resultado da soma do numero complexo
    public double SomaTotal() {

        return this.numTotal;
    }

    //metodo que retorna o numero complexo por extenso
    public String Numtotal() {

        return this.numExtenso;
    }

}
