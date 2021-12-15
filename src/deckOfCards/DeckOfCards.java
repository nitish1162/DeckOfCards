package deckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {
	private static final String suits[] = {"club", "diamond", "heart", "spade"};
    private static final String ranks[] = {null,"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
    private final ArrayList<Card> cards;
    
    public DeckOfCards(){
        cards = new ArrayList<Card>();
        for (int i = 0; i<suits.length; i++) {
            for(int j=0; j<ranks.length; j++){
                this.cards.add(new Card(suits[i],ranks[j]));
            }
        }   
        //Shuffle after the creation
        Collections.shuffle(this.cards);
        
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
	

}
