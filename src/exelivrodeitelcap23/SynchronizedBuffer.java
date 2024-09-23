/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

/**
 *
 * @author Diogo
 */
public class SynchronizedBuffer implements Buffer {

    private int buffer = -1; //compartilhado pelos threads producer and consumer
    private boolean occupied = false;

    //coloca o valor no buffer
    public synchronized void blockingPut(int value) throws InterruptedException {
        //enquanto nao houver posicoes vazias, coloca a thread em estado de espera
        while (occupied) {
            //envia informacoes da thread e do buffer para a saida, entao espera
            System.out.println("Producer tries to write."); //apenas para demonstracao
            displayState("Buffer full. Producer waits."); //apenas para demonstracao
            wait();
        }
        buffer = value; //configura novo valor de buffer

        //indica que a produtora nao pode armazenar outro valor
        //ate a consumidora recuperar valor atual de buffer
        occupied = true;
        displayState("Producer writes " + buffer); //apenas para demonstracao

        notifyAll(); //instrui thread(s) em espera a entrar no estado executável
    } //fim do metodo blockingPut; libera bloqueio em SynchronizedBuffer

    //retorna valor do buffer
    public synchronized int blockingGet() throws InterruptedException {
        //enquanto os dados nao sao lidos, coloca thread em estado de espera
        while (!occupied) {
            //envia informacoes da thread e do buffer para a saida, entao espera
            System.out.println("Consumer tries to read."); //apenas para demonstracao
            displayState("Buffer empty. Consumer waits."); //apenas para demonstracao
            wait();
        }
        //indica que a produtora pode armazenar outro valor
        //porque a consumidora acabou de recuperar o valor do buffer
        occupied = false;
        displayState("Consumer reads " + buffer); //apenas para demonstração
        notifyAll(); //instrui thread(s) em espera a entrar no estado executavel
        return buffer;
    } //fim do metodo blockingGet; libera bloqueio em SynchronizedBuffer

    //exibe a operacao atual e o estado de buffer; apenas para demonstracao
    private synchronized void displayState(String operation) {
        System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
    }
} //fim da classe SynchronizedBuffer
