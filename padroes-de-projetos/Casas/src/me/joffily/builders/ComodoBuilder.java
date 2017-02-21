package me.joffily.builders;

import java.util.List;

import me.joffily.enums.ComodoEnum;
import me.joffily.enums.MaterialEnum;
import me.joffily.enums.ParedeEnum;
import me.joffily.enums.PisoEnum;
import me.joffily.enums.PortaEnum;
import me.joffily.interfaces.Comodo;
import me.joffily.interfaces.Material;
import me.joffily.interfaces.Parede;
import me.joffily.interfaces.Piso;

public class ComodoBuilder {
	private Piso pisos;
	private List<Material> materiais;
	private List<Parede> paredes;
	private Comodo comodo;

	public ComodoBuilder(ComodoEnum c) {
		this.comodo = c.get();
	}

	// Determina Piso
	public ComodoBuilder setPiso(PisoEnum p) {
		this.comodo.setPiso(p.getPiso());
		return this;
	}

	// Adiciona portas
	public ComodoBuilder addPorta(PortaEnum p) {
		if (this.comodo.getPortas().size() > 3) {
			return this;
		}

		this.comodo.addPorta(p.get());
		return this;
	}

	// Adiciona parede
	public ComodoBuilder addParede(ParedeEnum p) {
		if (this.comodo.getParedes().size() >= 8) {
			return this;
		}

		this.comodo.addParede(p.get());
		return this;

	}

	// Add Material
	public ComodoBuilder addMaterial(MaterialEnum m) {
		if (this.comodo.getMateriais().size() >= 10) {
			return this;
		}

		this.comodo.addMaterial(m.get());
		return this;
	}

	public Comodo build() {
		return this.comodo;
	}

}
