package exelivrodeitelcap7;

import java.security.SecureRandom;

public class DeckOfCards {

    private Card[] deck; //array de objetos card
    private int currentCard; // indice da proxima card a ser distribuida
    private static final int NUMBER_OF_CARDS = 52; // numero constante de Cards

//gerador de numero aleatorio
    private static final SecureRandom randomNumbers = new SecureRandom();

    //construtor preenche baralho de cartas
    public DeckOfCards() {
        String[] faces = {"A  s", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] suits = {"Copas", "Paus", "Spada", "Ouro"};
        deck = new Card[NUMBER_OF_CARDS]; // cria array de objetos card
        currentCard = 0;// a primeira carta distribuida sera o deck[0];

        //preenche o baralho com objetos card
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);

        }
    }

    //embaralha as cartas com um algoritmo de uma passagem
    public void shuffle() {
        //aproxima chamada para o metodo dealCard deve comecar no deck[0] novamente
        currentCard = 0;

        //para cada card, seleciona outra Card aleatoria(0-51) e as compara
        for (int first = 0; first < deck.length; first++) {

            //seleciona um numero aleatorio entre 0 - 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //compara carta atual com carta aleatoria sorteada e as troca de lugar nos arrays
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //distribui uma Card
    public Card dealCard() {
        //determina se ainda ha Cards a serem distribuidas
        if (currentCard < deck.length) {
            return deck[currentCard++]; // retorna Card atual no array
        } else {
            return null; // retorna nulo para indicar que todos os Cards ja foram distribuidas
        }
    }
}
