package exelivrodeitelcap6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {

    //Cria um gerador seguro de numeros aleatorios
    private static final SecureRandom randomNumbers = new SecureRandom();

    //tipo enum com constantes que representam o estado do jogo
    private enum Status {
        CONTINUE, WON, LOST
    };

    //constantes que representam lancamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    //constantes com mensagens exibidas durante o jogo
    private static final String msg1 = "Vamos la de uma chance a sua sorte";
    private static final String msg2 = "Voce pode ficar milhonario";
    private static final String msg3 = "Aquele que nunca joga nunca ganha";
    private static final String msg4 = "Uma vez vi um homem entrar pobre e sair rico daqui";
    private static final String msg5 = "A sorte acompanha aqueles que a buscam";

    //joga uma partida de craps
    public static void main(String[] args) {
        //cria objeto scanner para captar entrada do teclado
        Scanner tec = new Scanner(System.in);

        //Declara variaveis
        boolean x = true;
        int balance = 1000;
        int myPoint = 0; // pontos se nao ganhar ou perder na 1 rolagem

        Status gameStatus; // pode conter CONTINUE, WON, LOST
        System.out.println("BEM VINDO AO CRAPS\nDigite");
        //loop de apostas se saldo positivo;
        while (x) {
            System.out.println();
            System.out.println("1 - Jogar \n0 - SAIR");
            int nume = tec.nextInt();
            if (nume == 0) {
                break;
            }

            int num = 1 + randomNumbers.nextInt(5);
            switch (num) {
                case (1): {
                    System.out.println(msg1);
                    break;
                }
                case (2): {
                    System.out.println(msg2);

                    break;
                }
                case (3): {
                    System.out.println(msg3);

                    break;
                }
                case (4): {
                    System.out.println(msg4);

                    break;
                }
                case (5): {
                    System.out.println(msg5);

                    break;
                }
            }

            //primeira rolagem dos dados
            int sumOfDice = rollDice();

            //determina o estado do jogo e a pontuacao com base no primeiro lancamento
            switch (sumOfDice) {
                case SEVEN: //ganha com 7 no primeiro lancamento
                case YO_LEVEN: //ganha com 11 no primeiro lancamento
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: // perde com 2 no primeiro lancamento
                case TREY: // perde com 3 no primeiro lancamento
                case BOX_CARS: //perde com 12 no primeiro lancamento
                    gameStatus = Status.LOST;
                    break;
                default: // nao ganhou em perdeu, portanto registra a pontuacao
                    gameStatus = Status.CONTINUE; // jogo nao terminou
                    myPoint = sumOfDice; //informa a pontuacao
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }
            //enquanto o jogo nao estiver completo
            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice(); // lanca novamente os dados

                //determina o estado do jogo
                if (sumOfDice == myPoint) { //vitoria por pontuacao
                    gameStatus = Status.WON;

                } else if (sumOfDice == SEVEN) { // perde obtendo 7 antes de atingir a pontuacao 
                    gameStatus = Status.LOST;

                }
            }
            //exibe mensagem ganhou ou perdeu
            if (gameStatus == Status.WON) {
                System.out.println("VITORIA");
                balance += 100;

            } else {
                System.out.println("Voce perdeu");
                balance -= 100;

            }
            System.out.println("Seu saldo e: " + balance);

            if (balance == 0) {
                x = false;
                System.out.println("E companheiro voce ficou POBRETAO");
            }
            if (balance >= 2000) {
                System.out.println("PARABENS VOCE ESTA RICO!!!");
                x = false;
            }
        }
    }

    public static int rollDice() {
        //seleciona valores aleatorios do dado
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        System.out.printf("Player rolled %d +%d = %d%n", die1, die2, sum);
        return sum;
    }
} // fim da classe
