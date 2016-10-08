package me.joffily.padroes;

import java.util.ArrayList;
import java.util.Random;

public abstract class CardSelector implements SelectCardMethods {
	
	public Card selectFrist(ArrayList deck) {
		return (Card)deck.remove(0);
	}
	
	public Card selectLast(ArrayList deck) {
		return (Card) deck.remove(deck.size()-1);
	}
	
	public Card selectRandom(ArrayList deck) {
		Random random = new Random();
		int deckSize = deck.size();
		int index = random.nextInt(deckSize + 1);
		return (Card) deck.remove(index);
	}

}
