/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap23;

/**
 *
 * @author Diogo
 */
public class ArrayWriter implements Runnable {

    private final SimpleArraySincronized sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArraySincronized array) {
        startValue = value;
        sharedSimpleArray = array;
    }

    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i); //adiciona um elemento ao array compartilhado
        }
    }
}//fim da classe ArrayWriter
