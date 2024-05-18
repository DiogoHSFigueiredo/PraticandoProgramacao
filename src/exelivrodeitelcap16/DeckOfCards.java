package exelivrodeitelcap16;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Diogo
 */
//declaracao da classe DeckOfCards
public class DeckOfCards {

    private List<Card> list; // declara List que armazenará cards

    //configura baralho de Cards e embaralha
    public DeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0; //numero de cartas

        //preenche baralho com objetos Card
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }
        list = Arrays.asList(deck); //obtem List
        Collections.shuffle(list); //embaralha as cartas
    } // fim do construtor DeckOfCards
    //gera saida de baralho

    public void printCards() {
        //exibe 52 cartas em duas colunas
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }

    }

    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}
