/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap20;

/**
 *
 * @author Diogo
 */
public class EmptyStackException extends RuntimeException {

    //construtor sem argumento
    public EmptyStackException() {
        this("Stack is empty");
    }

    //construtor de um argumento
    public EmptyStackException(String message) {
        super(message);
    }
}
