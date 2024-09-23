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
public class PrintTask implements Runnable {

    private static final SecureRandom generator = new SecureRandom();
    private final int sleepTime; //tempo de adormecimento aleatorio para athread
    private final String taskName;

//construtor
    public PrintTask(String taskName) {

        this.taskName = taskName;

        //seleciona tempo de adormecimento aleatorio entre 0 a 5 segundo
        sleepTime = generator.nextInt(5000); //milissegundos

    }

    //metodo run contem o codigo que uma thread executara
    public void run() {
        try { //coloca a thread para dormir pela quantidade de tempo sleepTime

            System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
            Thread.sleep(sleepTime); //coloca a thread para dormir
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); //reinterrompe a thread
        }

        //imprime o nome da tarefa
        System.out.printf("%s done sleeping%n", taskName);
    }
} //fim da classe PrintTask
