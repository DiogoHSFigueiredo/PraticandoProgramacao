/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Diogo
 */
public class SharedBufferTest {

    public static void main(String[] args) throws InterruptedException {
        //cria novo pool de threads com duas threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        //cria UnsynchronizedBuffer para armazenar ints
        Buffer sharedLocation = new UnsynchronizedBuffer();

        System.out.println("\tAction\t\tValue\tSum of Produced\t\tSum of Consumed");
        System.out.printf("\t-----------\t-----\t----------------\t--------------%n%n");
        //executa Producer e COnsumer, dando a cada um acesso a sharedLocation
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));
       
    }
}
  