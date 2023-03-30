package exelivrodeitelcap7;

/**
 *
 * @author Diogo
 */
public class DeckOfCardsTest {

    public static void main(String[] args) {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); //coloca Cards em ordem aleatória

        //imprime todas as 52 cartas na ordem em que elas são distribuidas
        for (int i = 1; i <= 52; i++) {

            //distribui e exibe uma card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) { // gera nova linha
                System.out.println();
            }

        }

    }

}
