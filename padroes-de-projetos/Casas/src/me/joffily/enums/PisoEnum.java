package me.joffily.enums;

import me.joffily.interfaces.Piso;
import me.joffily.piso.PisoCeramica;
import me.joffily.piso.PisoCeramicaEsmaltada;
import me.joffily.piso.PisoPorcelanato;

public enum PisoEnum {
	PORCELANATO(new PisoPorcelanato()), CERAMICA(new PisoCeramica()), CERAMICA_ESMALTADA(new PisoCeramicaEsmaltada());
	private Piso piso;

	private PisoEnum(Piso piso) {
		this.piso = piso;
	}

	public Piso getPiso() {
		return this.piso;
	}
}
