package me.joffily.padroes;

public class Player {
	private int number;
	private static int counter;
	private int points;
	
	public Player() {
		counter++;
		this.number = Player.counter;
	}

	public int getPoints() {
		return this.points;
	}

	public void addOnePoint() {
		this.points++;
	}
	
	public String toString() {
		return "Nome: Player-" + this.number + ", points: " + this.points;
	}
}
