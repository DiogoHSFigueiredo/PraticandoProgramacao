/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap8;

/**
 *
 * @author Diogo
 */
//Classe teste de Complex
public class testComplex {

    public static void main(String[] args) {

        Complex n1 = new Complex();
        System.out.println("n1 = "+n1.toString());
        Complex n2 = new Complex(2, 0.33);
        System.out.println("n2 = "+n2.toString());
        Complex n3 = new Complex(22.22, 33.33);
        System.out.println("n3 = "+n3.toString());
        Complex n4 = new Complex();
        n4.SomaComplex(n2, n3);
        System.out.println("n4 = "+n4.toString());
        Complex n5 = new Complex();
        n5.SubtracaoComplex(n2, n3);
        System.out.println("n5 = "+n5.toString());
        System.out.println("Numero extenso total n2 = "+n2.Numtotal()+"\nSoma total n2 = "+n2.SomaTotal());
    }
}
