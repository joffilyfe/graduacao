package me.joffily.factory;

import me.joffily.casas.CasaBasica;
import me.joffily.casas.CasaConforto;
import me.joffily.casas.CasaLuxo;
import me.joffily.enums.PisoEnum;
import me.joffily.paredes.ParedeAlvenaria;
import me.joffily.paredes.ParedeAlvenariaDry;
import me.joffily.paredes.ParedeGesso;
import me.joffily.portas.PortaMadeira;
import me.joffily.portas.PortaMadeiraLei;
import me.joffily.portas.PortaMdf;

public class FactoryCasa {

	public CasaBasica criarCasaBasica() {
		CasaBasica casa = new CasaBasica();
		casa.setPiso(PisoEnum.CERAMICA.getPiso());
		casa.setParede(new ParedeGesso());
		casa.setPorta(new PortaMdf());
		return casa;
	}

	public CasaConforto criarCasaConforto() {
		CasaConforto casa = new CasaConforto();
		casa.setPiso(PisoEnum.CERAMICA_ESMALTADA.getPiso());
		casa.setParede(new ParedeAlvenaria());
		casa.setPorta(new PortaMadeira());
		return casa;
	}

	public CasaLuxo criarCasaLuxo() {
		CasaLuxo casa = new CasaLuxo();
		casa.setPiso(PisoEnum.PORCELANATO.getPiso());
		casa.setParede(new ParedeAlvenariaDry());
		casa.setPorta(new PortaMadeiraLei());
		return casa;
	}
}
