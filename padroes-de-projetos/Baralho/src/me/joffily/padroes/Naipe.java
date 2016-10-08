package me.joffily.padroes;

public class Naipe {
	private String naipe;
	private int value;
	
	public Naipe(String naipe, int value) {
		this.naipe = naipe;
		this.value = value;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return "("+this.naipe+":"+this.value+")";
	}
}
