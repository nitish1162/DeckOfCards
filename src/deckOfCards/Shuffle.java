package deckOfCards;

import java.util.ArrayList;

public class Shuffle {
	
	public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();     
        ArrayList<Card> cards = deck.getCards();        
        for(Card card:cards){
            System.out.println(card);
        }
        
    }

}
