/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.datastructures;

/**
 *
 * @author Diogo
 * @param <T>
 */
public class Queue<T> {

    private List<T> queueList;

    //construtor
    public Queue() {

        queueList = new List<T>("queue");
    }

    //adiciona o objeto a fila
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }

    //remove o ovjeto da fila
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }

    //determina se a fila esta vazia
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    //gera o conteudo da fila
    public void print() {
        queueList.print();
    }
} //fim da classe Queue
