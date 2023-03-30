package exelivrodeitelcap1;

import java.util.Scanner; //Programa utiliza a classe Scanner
/**
 *
 * @author Diogo
 */
public class Comparison {
    
    //Método principal
    public static void main(String[] args) {
       
        //Cria objeto Scanner para utilização
        Scanner input = new Scanner(System.in);
        
        int number1; //Primeiro número a comparar
        int number2; //Segundo número a comparar
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); // Lê o primeiro número fornecido pelo usuário
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); // Lê o segundo número fornecido pelo usuário
        
        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }
        if (number1 != number2){
            System.out.printf("%d != %d%n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }
    
    } // fim do main
    
} // fim da clase
