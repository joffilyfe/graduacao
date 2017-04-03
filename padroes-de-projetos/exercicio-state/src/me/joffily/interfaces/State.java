package me.joffily.interfaces;

import me.joffily.states.Panico;

public interface State {
	public State tick();

	public Panico panic();

	public State off();

	public State on();

}
