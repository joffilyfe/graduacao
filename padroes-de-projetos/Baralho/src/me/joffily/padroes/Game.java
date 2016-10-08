package me.joffily.padroes;

import java.util.ArrayList;

public class Game extends CardSelector {
	private ArrayList<Player> players;
	private ArrayList<Card> deck;
	
	public Game() {
		DeckOfCards deckofcards = new DeckOfCards();
		this.players = new ArrayList<Player>();
		this.deck = deckofcards.getDeck();
		this.players.add(new Player());
		this.players.add(new Player());
		System.out.println(deck);
	}

	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	private Player getRoundWinner() {
		if (this.deck.isEmpty()) {
			return null;
		}

		// Seleciona a carta baseado no algoritmo de seleção escolhido
		Card firstCard = selectRandom(this.deck);
		Card secondCard = selectRandom(this.deck);

		// Verifica qual carta tem maior valor
		if (firstCard.betterThan(secondCard)) {
			return this.players.get(0);
		}

		return this.players.get(this.players.size()-1);
	}
	
	public void start() {
		int plays = 1;
		
		do {
			Player player = getRoundWinner();
			player.addOnePoint();
			plays++;
		} while (plays <= 10);
		
		if (this.players.get(0).getPoints() == this.players.get(1).getPoints()) {
			System.out.println("One more time..");
			Player player = getRoundWinner();
			player.addOnePoint();
		}

		System.out.println(this.players.get(0));
		System.out.println(this.players.get(1));
	}
	
}
