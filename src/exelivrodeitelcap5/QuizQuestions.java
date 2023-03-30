/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap5;

//classe com quiz de 5 perguntas e feedback conforme pontuacao de acertos
import java.util.Scanner;

public class QuizQuestions {

    public static void main(String[] args) {

        //Cria objeto Scanner para receber as entradas do teclado
        Scanner tec = new Scanner(System.in);
        int totAcertos = 0;
        String opcao = "";

        //Strings com as perguntas a serem definidas pelo desenvolvedor já pré selecionado onde ficará a resposta correta.
        String q1 = "A - ABCD\nB - ABCD\nC - ABCD\nD - ABCD"; //Opcao correr B
        String q2 = "A - ABCD\nB - ABCD\nC - ABCD\nD - ABCD"; //Opcao correr A
        String q3 = "A - ABCD\nB - ABCD\nC - ABCD\nD - ABCD"; //Opcao correr D
        String q4 = "A - ABCD\nB - ABCD\nC - ABCD\nD - ABCD"; //Opcao correr C

        System.out.println(q1 + "\nPargunta 1 - Digite sua resposta A-B-C-D");
        opcao = tec.nextLine();
        if ("B".equals(opcao) || "b".equals(opcao)) {
            totAcertos += 1;
        }
        System.out.println(q2 + "\nPergunta 2 - Digite sua resposta A-B-C-D");
        opcao = tec.nextLine();
        if ("A".equals(opcao) || "a".equals(opcao)) {
            totAcertos += 1;
        }
        System.out.println(q3 + "\nPergunta 3 - Digite sua resposta A-B-C-D");
        opcao = tec.nextLine();
        if ("D".equals(opcao) || "d".equals(opcao)) {
            totAcertos += 1;
        }
        System.out.println(q4 + "\nPergunta 4 - Digite sua resposta A-B-C-D");
        opcao = tec.nextLine();
        if ("C".equals(opcao) || "c".equals(opcao)) {
            totAcertos += 1;
        }

        switch (totAcertos) {
            case (4): {
                System.out.println("Excelente conhecimento");
                break;
            }
            case (3): {
                System.out.println("Muito Bom");
                break;
            }
            case (2): {

            }
            case (1): {

            }
            case (0): {
                System.out.println("Aprimorar conhecimentos");
            }
        }

    }

}
