package exelivrodeitelcap4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diogo
 */
public class Exe422 {

    public static void main(String[] args) {

        System.out.println("N\t10*N\t100*N\t1000*N");
        int cont = 1;
        while (cont <= 5) {
            System.out.printf("%d\t%d\t%d\t%d\n", cont, cont * 10, cont * 100, cont * 1000);
            cont++;
        }
    }

}
