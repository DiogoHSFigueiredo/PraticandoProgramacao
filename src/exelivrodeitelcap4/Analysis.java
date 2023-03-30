/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap4;

//Classe recebe notas de teste para corretores, verifica as aprovacoes e reprovacoes e decide se um bonus deve ser pago ao instrutor
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class Analysis {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        //inicializa variaveis locais
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.println("Entre com o resultado do aluno " + studentCounter + ": digite 1 = aprovado ou 2 = reprovado");
            int result = tec.nextInt();

            if (result == 1) {
                ++passes;
            } else {
                ++failures;
            }
            ++studentCounter;

        }
        System.out.printf("Pased: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Pagar bonus ao instrutor");
        }

    }

}
