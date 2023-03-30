/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
public class Card {

    private final String face; //face da carta
    private final String suit; //naipe da carta

    //construtor inicializa face e naipe
    public Card(String cardFace, String cardSuit) {

        this.face = cardFace;
        this.suit = cardSuit;
    }

    //metodo toString sobrescrito
    @Override
    public String toString() {
        return face + " de " + suit;
    }

}// fim da classe
