package exelivrodeitelcap1;

import java.util.Scanner; //Programa utiliza a classe Scanner
/**
 *
 * @author Diogo
 */
public class Comparison {
    
    //M�todo principal
    public static void main(String[] args) {
       
        //Cria objeto Scanner para utiliza��o
        Scanner input = new Scanner(System.in);
        
        int number1; //Primeiro n�mero a comparar
        int number2; //Segundo n�mero a comparar
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); // L� o primeiro n�mero fornecido pelo usu�rio
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt(); // L� o segundo n�mero fornecido pelo usu�rio
        
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
