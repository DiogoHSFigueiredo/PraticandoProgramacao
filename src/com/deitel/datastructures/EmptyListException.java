/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.datastructures;

/**
 *
 * @author Diogo
 */
public class EmptyListException extends RuntimeException {

    //construtor
    public EmptyListException() {
        this("list"); //chama outro construtor de EmptyListException
    }

    //construtor
    public EmptyListException(String name) {
        super(name + " is empty"); //chama construtor de superclasse
    }

} //fim da classe EmptyListException
