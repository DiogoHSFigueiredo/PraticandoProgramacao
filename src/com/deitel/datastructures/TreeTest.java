/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.datastructures;

import java.security.SecureRandom;

/**
 *
 * @author Diogo
 */
public class TreeTest {

    public static void main(String[] args) {

        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomNumber = new SecureRandom();

        System.out.println("Inserting the following values: ");

        //insere 10 inteiros aleatorios de 0 a 99 na arvore
        for (int i = 1; i <= 10; i++) {

            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }
        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();

        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();

        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();
    }
}
