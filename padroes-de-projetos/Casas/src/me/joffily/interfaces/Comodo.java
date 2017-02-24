package me.joffily.interfaces;

import java.util.List;

public interface Comodo {

	public void addMaterial(Material m);

	public void addParede(Parede p);

	public void addPorta(Porta p);

	public List<Porta> getPortas();

	public void setPiso(Piso piso);

	public List<Parede> getParedes();

	public List<Material> getMateriais();
}
