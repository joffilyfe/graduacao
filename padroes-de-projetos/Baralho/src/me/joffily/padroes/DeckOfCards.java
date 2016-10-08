package me.joffily.padroes;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
	private String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] naipes = {"Ouro", "Copas", "Espadas", "Paus"};
	private ArrayList<Card> deck;

	public DeckOfCards() {
		deck = new ArrayList<Card>();
	}
	
	private void generate() {
		int naipeValue = 1;
		for (String naipe : this.naipes) {
			int cardValue = 1;
			Naipe objnaipe = new Naipe(naipe, naipeValue++);
			for (String card : this.cards) {
				Card c = new Card(card, cardValue++);
				c.setNaipe(objnaipe);
				this.deck.add(c);
			}
		}
	}
	
	public void sortDeck() {
		Collections.shuffle(this.deck);
	}
	
	public ArrayList<Card> getDeck() {
		generate();
		sortDeck();
		return this.deck;
	}
}
