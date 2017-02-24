package me.joffily.enums;

import me.joffily.interfaces.Porta;
import me.joffily.portas.PortaMdf;

public enum PortaEnum {
	MDF(new PortaMdf());
	private Porta porta;

	private PortaEnum(Porta p) {
		this.porta = p;
	}

	public Porta get() {
		return this.porta;
	}
}
