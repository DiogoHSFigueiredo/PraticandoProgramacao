package exelivrodeitelcap11;
//Classe demonstra a divisão de inteiro por 0 sem tratamento de exceÃ§Ã£o.
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Diogo
 */
public class DivideByZeroNoExceptionHandling {
    //demonstra o lancamento de uma excessão quando ocorre uma divisão por zero
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException {
        return numerator / denominator; //possível divisão por zero
    }
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        boolean continueLoop = true; //determina se mais entradas sao necessarias
        do {
            try // le dois numeros e calcula o quociente
            {
                System.out.print("Por favor insira um numerador inteiro\n");
                int numerator = tec.nextInt();

                System.out.print("Por favor insira um denominador inteiro\n");
                int denominator = tec.nextInt();

                 int result = quotient(numerator, denominator);

                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false; //entrada bem sucedida; fim do loop
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                tec.nextLine();//descarta entrada para o usuario tentar de novo
                System.out.printf("You must enter integers. Please try again. %n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("zero is an invalid denominator. Please try again. %n%n");
            }
        } while (continueLoop);
    }
} // fim da classe
