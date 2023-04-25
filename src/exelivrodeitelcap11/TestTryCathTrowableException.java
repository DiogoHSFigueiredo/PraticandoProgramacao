/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap11;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class TestTryCathTrowableException {

    public static int divisao(int a, int b) throws ArithmeticException, InputMismatchException, FileNotFoundException {

        int resultado = a / b;

        if (resultado > 1) {
            throw new FileNotFoundException();
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int divisor, dividendo;

        try {

            System.out.println("Programa de Divisao\nDigite o dividento");
            divisor = teclado.nextInt();
            System.out.println("Digite o divisor");
            dividendo = teclado.nextInt();

            System.out.println("Resultado da divisao: " + divisao(divisor, dividendo));

        } catch (ArithmeticException e) {
            System.out.println("Atencao nao dividir por 0 " + e);
        } catch (InputMismatchException e) {
            System.out.println("Atencao digitar um numero " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Erro de Acesso a Arquivo " + e);
        }

    }

}
