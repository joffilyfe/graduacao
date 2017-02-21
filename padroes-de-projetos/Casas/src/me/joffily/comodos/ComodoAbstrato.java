package me.joffily.comodos;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.Comodo;
import me.joffily.interfaces.Material;
import me.joffily.interfaces.Parede;
import me.joffily.interfaces.Piso;
import me.joffily.interfaces.Porta;

public abstract class ComodoAbstrato implements Comodo {

	private List<Porta> portas = new ArrayList<Porta>();
	private List<Parede> paredes = new ArrayList<Parede>();
	private List<Material> materiais = new ArrayList<Material>();
	@SuppressWarnings("unused")
	private Piso piso;

	@Override
	public void addMaterial(Material m) {
		this.materiais.add(m);
	}

	@Override
	public void addParede(Parede p) {
		this.paredes.add(p);
	}

	@Override
	public void addPorta(Porta p) {
		this.portas.add(p);
	}

	@Override
	public List<Porta> getPortas() {
		return this.portas;
	}

	@Override
	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	@Override
	public List<Parede> getParedes() {
		return this.paredes;
	}

	@Override
	public List<Material> getMateriais() {
		return this.materiais;
	}

}
