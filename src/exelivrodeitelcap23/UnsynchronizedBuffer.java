/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

/**
 *
 * @author Diogo
 */
public class UnsynchronizedBuffer implements Buffer {

    private int buffer = -1; //compartilhado pelas threads producer e consumer

    //coloca o valor no buffer
    public void blockingPut(int value) throws InterruptedException {
        System.out.printf("Producer writess %2d", value);
        buffer = value;
    }

    //retonra valor do buffer
    public int blockingGet() throws InterruptedException {
        System.out.printf("Consumer reads\t%2d", buffer);
        return buffer;
    }
} //fim da classe UnsynchronizesBuffer
