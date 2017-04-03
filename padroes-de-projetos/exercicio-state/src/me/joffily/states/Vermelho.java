package me.joffily.states;

import me.joffily.interfaces.State;

public class Vermelho implements State {

	@Override
	public State tick() {
		return new Verde();
	}

	@Override
	public Panico panic() {
		return new Panico();
	}

	@Override
	public State off() {
		return new AmareloIntermitente();
	}

	@Override
	public State on() {
		return new Vermelho();
	}

	@Override
	public String toString() {
		return "Vermelho";
	}
}
