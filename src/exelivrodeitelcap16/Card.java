package exelivrodeitelcap16;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Diogo
 */
public class Card {

    public static enum Face {
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    };

    public static enum Suit {
        Clubs, Diamonds, Hearts, Spades
    };

    private final Face face;
    private final Suit suit;

    //construtor
    public Card(Face face, Suit suit) {

        this.face = face;
        this.suit = suit;
    }

    //retorna a face da carta
    public Face getFace() {
        return face;
    }

    //retorna naipe de Card
    public Suit getSuit() {
        return suit;
    }

    //retorna representacao String de Card
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}


