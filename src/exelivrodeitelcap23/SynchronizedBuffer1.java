/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Diogo
 */
public class SynchronizedBuffer1 implements Buffer {

    //Bloqueio para controlar sincronizacao com esse buffer
    private final Lock acessLock = new ReentrantLock();

    //condicoes para controlar leitura e gravacao
    private final Condition canWrite = acessLock.newCondition();
    private final Condition canRead = acessLock.newCondition();

    private int buffer = -1; //compartilhado pelas threads producer e consumer
    private boolean occupied = false; //se o buffer estiver ocupado

    //coloca o valor int no buffer
    public void blockingPut(int value) throws InterruptedException {
        acessLock.lock(); //bloqueia esse objeto

        //envia informacoes da thread e do buffer para a saida, entao espera
        try {
            //enquanto o buffer nao estiver vazio, coloca thread no estado de espera
            while (occupied) {
                System.out.println("Producer tries to write.");
                displayState("Buffer full. Producer waits.");
                canWrite.await(); //espera até que o buffer esteja vazio
            }
            buffer = value; //configura novo valor de buffer

            //indica que a produtora nao pode armazenar outro valor
            //ate a consumidora recuperar valor atual de buffer
            occupied = true;

            displayState("Produces writes" + buffer);

            //sinaliza quaisquer threads que estao esperando para ler o buffer
            canRead.signalAll();
        } finally {
            acessLock.unlock(); //desbloqueia esse objeto
        }
    }

//retorna valor do buffer
    public int blockingGet() throws InterruptedException {
        int readValue = 0; //inicializa do valor lido a partir do buffer
        acessLock.lock(); //bloqueia esse objeto

        //envia informacoes da thread e do buffer para a saida, entao espera
        try {
            //se nao houver dados para serem lidos, coloca a thread em estado de espera
            while (!occupied) {
                System.out.println("Consumer tries to read.");
                displayState("Buffer empty. Consumer waits.");
                canRead.wait(); //espera até o buffer tornar-se cheio
            }

            //indica que a produtora pode armazenar outro valor
            //porque a consumidora acabou de recupera o valor do buffer
            occupied = false;

            readValue = buffer; //recupera o valor do buffer
            displayState("Consumer reads " + readValue);

            //sinaliza qualquer thread que esta esperando o buffer tornar-se vazio
            canWrite.signalAll();
        } finally {
            acessLock.unlock(); //desbloqueia esse objeto
        }
        return readValue;
    }

//exibe a operacao atual e o estado do buffer
    private void displayState(String operation) {
        try {
            acessLock.lock(); //desbloqueia esse objeto
            System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
        } finally {
            acessLock.unlock(); //desbloqueia esses objetos
        }
    }
} //fim da classe SynchronizedBuffer
