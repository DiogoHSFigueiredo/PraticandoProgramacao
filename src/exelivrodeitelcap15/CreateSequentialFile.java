/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CreateSequentialFile {

    private static ObjectOutputStream output; // gera saida dos dados no arquivo

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    //abre o arquivo clients.ser
    public static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    //adiciona registros ao arquivo
    public static void addRecords() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n_ ", "Enter account number, first name, last name and balance.", "Or enter '0' in account number to indicator to end input.");

        while (input.hasNext()) { //faz um loop ate o indicador de fim de arquiv
            try {
                //cria novo registro; esse exemplo supoe uma entrada válida
                int x = input.nextInt();
                if (x == 0) {
                    break;
                }
                Account record = new Account(x, input.next(), input.next(), input.nextDouble());

                //serializa o obeto de registro em um arquivo
                output.writeObject(record);
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); //descarta entrada para o usuario tentar de novo
            } catch (IOException ioException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            System.out.print("Registro inserido com sucesso\n Digite outro registro ou Digite '0' para sair.\n_");

        }
    }

//fecha o arquivo e termina o aplicativo
    public static void closeFile() {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
        }
    }
} //fim da classe CreateSequentialFile
