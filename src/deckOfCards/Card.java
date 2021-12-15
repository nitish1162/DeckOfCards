package deckOfCards;

public class Card {
	private final String suit;
    private final String rank;
    
    
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }       
    
    @Override
    public String toString() {
        return "Card [suit=" + suit + ", rank=" + rank + "]";
    }

}
