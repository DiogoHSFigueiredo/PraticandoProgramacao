package exelivrodeitelcap7;

/*
O que é: 
    Logica simples para entrada de numeros inteiros (simula notas fiscais) e verifica se o numero inserido já consta no "banco" Array de armazenamento.

O que ele faz:
    Recebe numeros inteiros, verifica se o numero digitado já está armazenado na "memoria" (Array) e valida sua entrada ou solicita novo numero

Como ele faz:
    Detalhado no corpo do programa

 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class EliminacaoDuplicatas {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in); // cria objeto scanner para receber entrada do usuario
        int[] tabela = new int[5]; //vetor para armazenamento dos numeros
        int numero; //variavel para armazenar numero digitado
        boolean x = false; //variavel de validacao do numero digitado p/ checagem se o numero ja existe no array

        //loop que irá fazer todo o processo de "encher" o array com numeros diferentes
        for (int i = 0; i < 5;) {

            System.out.println("Digite o numero da duplicata de 10 a 100"); //mensagem ao usuario
            numero = tec.nextInt(); //variavel recebe entrada do usuario a partir do objeto teclado

            //loop que itera os valores existentes no array ate o momento
            for (int n : tabela) {

                //testa se o numero digitado existe no array e altera a variavel x para true/false
                if (numero == n) {
                    x = true;
                    break;
                } else {
                    x = false;
                }
            }

            //conforme a condicao de x (variavel que informa se o ultimo numero digitado existe ou nao no array) realiza diversas operacoes
            //se já existe informa numero duplicado, ignora o restante do código e "pula" para a proxima iteracao do loop
            if (x == true) {
                System.out.println("Numero duplicado");
                continue;
                //testa se o x é false, o que nos informa que o ultimo numero digitado nao existe no array e testa também a regra para o intervalo de numeros aceitos para o array
                //grava o numero no indice i correspondente, e incrementa i
            } else if ((x == false) && (numero >= 10 && numero <= 100)) {
                tabela[i] = numero;
                i++;
                continue;
                //se o numero não existir no array mas estiver fora do intervalo, retorna a mensagem (numero fora do intervalo)
            } else {
                System.out.println("Numero fora do intervalo");
                continue;
            }
        }
        //ordena os elementos do array
        Arrays.sort(tabela);

        //itera para exibir todos os elementos do array com mensagem padrão
        System.out.println("TABELA DE NUMEROS:");
        for (int num : tabela) {
            System.out.println(num);
        }
    }
}
