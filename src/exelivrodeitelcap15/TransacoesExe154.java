/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class TransacoesExe154 {

    private static Formatter objSaida;
    private static Formatter objSaida1;
    private static Scanner objEntrada;
    private static Scanner objEntrada1;
    private static StringBuilder temp;
    private static StringBuilder temp1;

    public static void main(String[] args) throws IOException {

        Scanner tec = new Scanner(System.in);
        int opcao;
        System.out.println("Bem VINDO - Digite a opcao desejada");
        do {
            System.out.println("1 - Incluir Transacao\n2 - Extrato Consolidado\n0 - SAIR");
            opcao = tec.nextInt();

            if (opcao == 0) {
                System.out.println("Tchau, obrigado!");
                System.exit(1);
            } else if (opcao != 1 && opcao != 2) {
                System.out.println("Opcao Invalida, repita a operacao");
                System.exit(1);
            } else if (opcao == 1) {

                int conta;
                double vlcompra;
                Scanner tec1 = new Scanner(System.in);
                System.out.println("Digite o numero da conta");
                conta = tec1.nextInt();
                System.out.println("Digite o valor da compra");
                vlcompra = tec1.nextDouble();

                LacarTransacao(conta, vlcompra);

            } else if (opcao == 2) {
                AtualizarConsolidado();
                objSaida = new Formatter("transacoes.txt");
                objSaida.format("");
                FecharArquivo();
            }
        } while (opcao != 0);

    }

    public static void LacarTransacao(int conta, double vlcompra) throws IOException {

        try {
            temp = new StringBuilder();

            if (Files.exists(Paths.get("transacoes.txt"))) {
                objEntrada = new Scanner(Paths.get("transacoes.txt"));
                while (objEntrada.hasNext()) {

                    temp.append(objEntrada.nextLine()).append("\n");

                }
            }

            objSaida = new Formatter("transacoes.txt");

            objSaida.format(temp.toString() + "%d %.2f%n", conta, vlcompra);

        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); //termina o programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); //termina o programa
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");
        }

        FecharArquivo();

    }

    public static void AtualizarConsolidado() throws IOException {

        temp = new StringBuilder();

        try {
            int var1 = 1;
            boolean control1 = true;

            while (control1) {
                if (!Files.exists(Paths.get("global.txt"))) {

                    objSaida = new Formatter("global.txt");
                    objSaida.close();

                } else if (Files.exists(Paths.get("global" + var1 + ".txt"))) {
                    var1++;
                } else {
                    var1--;
                    control1 = false;
                }

            }

            objEntrada = new Scanner(Paths.get("transacoes.txt"));

            boolean control = true;
            int var = 1;
            while (control) {
                if (Files.exists(Paths.get("global" + var + ".txt"))) {
                    var++;
                } else {
                    objSaida = new Formatter("global" + var + ".txt");
                    control = false;
                }

            }
            if (var1 == 0) {
                objEntrada1 = new Scanner(Paths.get("global.txt"));
            } else {
                objEntrada1 = new Scanner(Paths.get("global" + var1 + ".txt"));
            }
            while (objEntrada1.hasNext()) {

                temp.append(objEntrada1.nextLine()).append("\n");
            }

            while (objEntrada.hasNext()) {

                temp.append(objEntrada.nextLine()).append("\n");

            }
            objSaida.format("%s%n", temp.toString());

        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); //termina o programa
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");
        }

        FecharArquivo();

    }

    public static void FecharArquivo() {
        if (objSaida != null) {
            objSaida.close();
        }
        if (objEntrada != null) {
            objEntrada.close();
        }
        if (objSaida1 != null) {
            objSaida1.close();
        }
        if (objEntrada1 != null) {
            objEntrada1.close();
        }

    }

}
