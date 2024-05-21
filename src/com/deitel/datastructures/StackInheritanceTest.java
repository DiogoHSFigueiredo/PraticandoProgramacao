/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.datastructures;

/**
 *
 * @author Diogo
 */
public class StackInheritanceTest {

    public static void main(String[] args) {

        StackInheritance<Integer> stack = new StackInheritance<>();

        //utiliza o metodo push
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        //remove itens da pilha
        try {
            int removedItem;
            while (true) {
                removedItem = stack.pop(); //utiliza o metodo pop
                System.out.printf("%n%d popped%n", removedItem);
                stack.print();
            }
        } catch (EmptyListException emptyListExceptio) {
            emptyListExceptio.printStackTrace();

        }
    }

} //fim da classe StackInheritanceTest
