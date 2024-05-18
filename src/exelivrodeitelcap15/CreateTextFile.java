/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CreateTextFile {

    private static Formatter output; //envia uma saida de texto para um arquivo

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    //abre o arquivo clientes.txt
    public static void openFile() {
        try {
            String name;
            System.out.println("Digite o nome do arquivo que ira gravar os registros");
            Scanner entrada = new Scanner(System.in);
            name = entrada.nextLine();
            output = new Formatter(name+".txt"); //Cria ou abre o arquivo

        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); //termina o programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); //termina o programa
        }
    }

    //adiciona registros ao arquivo
    public static void addRecords() {

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s ", "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.", "Entre c/ registro:");
        int cont = 0;
        while (cont < 6) //faz um loop até o indicador de fim de arquivo
        {
            try {
                //gera saida do novo registro para o arquivo; supoe entrada válida
                output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); //descarta entrada para o usuario tentar de novo
                cont--;
            }

            cont++;

            System.out.print(" Entre c/ novo registro: ");
        }//fim do while
    }//fim do método addRecords

    //fecha o arquivo
    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
} // fim da classe CreateTextFile
