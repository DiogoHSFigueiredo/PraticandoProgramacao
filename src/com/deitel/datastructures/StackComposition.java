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
public class StackComposition<T> {

    private List<T> stackList;

    //construtor
    public StackComposition() {

        stackList = new List<T>("stack");
    }

    //adiciona objeto a pilha
    public void push(T object) {
        stackList.insertAtFront(object);
    }

    //remove objeto da pilha
    public T pop() throws EmptyListException {
        return stackList.removeFromFront();
    }

    //determina se a pilha esta vazia
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    //gera saida do conteudo de pilha
    public void print() {
        stackList.print();
    }
} //fim da classe StackComposition
