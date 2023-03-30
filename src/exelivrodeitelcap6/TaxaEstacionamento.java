package exelivrodeitelcap6;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Diogo
 */
public class TaxaEstacionamento {

    public static void main(String[] args) {

        //Cria objeto para gerar numeros aleatorios
        SecureRandom geraNumeros = new SecureRandom();
        //Cria objeto para receber entrada do usuario
        Scanner tec = new Scanner(System.in);

        String placa;
        double tarifaMinima;
        double tarifaAdicional;
        int horaEntrada;
        int minutoEntrada;
        int horaSaida;
        int minutoSaida;
        String notasDiaAnterior = "";
        double tarifaPaga = 0;
        boolean x = true;
        System.out.println("Bem vindo ao Estacionamento");

        while (x = true) {
            System.out.println("Insira a placa do seu carro com 7 algarismos\nSAIR DIGITE 00");
            placa = tec.nextLine();

            if ("00".equals(placa)) {
                x = false;
                break;
            }
            horaEntrada = geraNumeros.nextInt(24);
            minutoEntrada = geraNumeros.nextInt(60);
            System.out.println("Registro de entrada realizado!!");

            horaSaida = geraNumeros.nextInt(24);
            while (horaSaida < horaEntrada) {
                horaSaida = geraNumeros.nextInt(24);
            }
            minutoSaida = geraNumeros.nextInt(60);

            if (horaSaida < horaEntrada + 3) {
                tarifaPaga += 2.00;
            } else if (horaSaida > horaEntrada + 3) {
                tarifaPaga = 2.00 + ((horaSaida - (horaEntrada + 3)) * 0.50);
            }
            if (minutoSaida != 0 && horaSaida > horaEntrada + 3) {
                tarifaPaga += 0.50;
            }
            notasDiaAnterior += tarifaPaga + ":\n";
            System.out.println("Hora de entrada " + horaEntrada + ":" + minutoEntrada + "\nHora de saida " + horaSaida + ":" + minutoSaida);
            System.out.println("Veiculo de placa: " + placa + "\nValor a pagar: " + tarifaPaga);
        }
        System.out.println("O valor das comanda do dia anterior e: " + notasDiaAnterior);

    }
}
