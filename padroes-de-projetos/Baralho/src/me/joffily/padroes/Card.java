package me.joffily.padroes;

public class Card {
	private String code;
	private int value;
	private Naipe naipe;
	
	public Card(String code, int value) {
		this.code = code;
		this.value = value;
	}
		
	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean betterThan(Card card) {
		if (this.naipe.getValue() > card.getNaipe().getValue()) {
			return true;
		}
		
		if (this.value > card.getValue()) {
			return true;
		}
		
		return false;
	}

	public String toString() {
		return "{" + this.code + ":"+this.value+":"+this.naipe+"}";
	}
}
