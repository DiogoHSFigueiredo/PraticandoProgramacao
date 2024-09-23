/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Diogo
 */
public class BlockingBuffer implements Buffer {

    private final ArrayBlockingQueue<Integer> buffer; //buffer compartilhado

    public BlockingBuffer() {
        buffer = new ArrayBlockingQueue<Integer>(1);
    }

    //coloca o valor no buffer
    public void blockingPut(int value) throws InterruptedException {
        buffer.put(value); //coloca o valor no buffer
        System.out.printf("%s%2d\t%s%d%n", "Producer writes", value, "Buffer cells occupied: ", buffer.size());

    }

    //retorna o valor de buffer
    public int blockingGet() throws InterruptedException {
        int readValue = buffer.take(); //remove o valor do buffer
        System.out.printf("%s %2d\t%s%d%n", "Consumer reads ", readValue, "Buffer cells occupied: ", buffer.size());

        return readValue;
    }
} //fim da classe BlockingBuffer
