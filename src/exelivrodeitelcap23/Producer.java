/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.security.SecureRandom;

/**
 *
 * @author Diogo
 */
//Produtor com u mmétodo run que insere os valores de 1 a 10 em um Buffer.
public class Producer implements Runnable {

    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation; //referencia a objeto compartilhado

    //construtor
    public Producer(Buffer sharedLocation) {

        this.sharedLocation = sharedLocation;
    }

    //armazena os valores de 1 a 10 em sharedLocation
    public void run() {

        int sum = 0;

        for (int count = 1; count <= 10; count++) {

            try { //dorme de 0 a 3 segundos, entao coloca o valor em Buffer
                Thread.sleep(generator.nextInt(3000)); //sono aleatorio
                sharedLocation.blockingPut(count); //configura valor no buffer
                sum += count; //incrementa soma de valores
              //  System.out.printf("\t%2d%n ", sum);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.printf("Producer done producing%nTerminating Producer%n");
    }
}//fim da classe Producer
