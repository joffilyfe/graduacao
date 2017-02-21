package me.joffily.enums;

import me.joffily.interfaces.Parede;
import me.joffily.paredes.ParedeGesso;

public enum ParedeEnum {
	GESSO(new ParedeGesso());

	private Parede parede;

	private ParedeEnum(Parede p) {
		this.parede = p;
	}

	public Parede get() {
		return this.parede;
	}
}
