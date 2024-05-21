/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.datastructures;

/**
 *
 * @author Diogo
 */
public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        //utiliza o metodo enqueue
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        //remove os objetos da fila
        try {
            int removedItem;
            while (true) {
                removedItem = queue.dequeue(); //utiliza metodo dequeue
                System.out.printf("%n%d dequeued%n", removedItem);
                queue.print();
            }
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
} //fim da classe QueueTest
