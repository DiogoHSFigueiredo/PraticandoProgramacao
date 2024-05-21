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
public class StackInheritance<T> extends List<T> {

    //construtor
    public StackInheritance() {
        super("stack");
    }

    //adiciona objeto a pilha
    public void push(T object) {
        insertAtFront(object);
    }

    //remove objeto da pilha
    public T pop() throws EmptyListException {
        return removeFromFront();
    }

} //fim da classe StackInheritance
