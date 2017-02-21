package me.joffily.enums;

import me.joffily.comodos.Banheiro;
import me.joffily.comodos.Quarto;
import me.joffily.interfaces.Comodo;

public enum ComodoEnum {
	QUARTO(new Quarto()), BANHEIRO(new Banheiro());
	private Comodo comodo;

	private ComodoEnum(Comodo c) {
		this.comodo = c;
	}

	public Comodo get() {
		return this.comodo;
	}
}
