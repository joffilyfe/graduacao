package me.joffily.casas;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.Casa;
import me.joffily.interfaces.Comodo;
import me.joffily.interfaces.Parede;
import me.joffily.interfaces.Piso;
import me.joffily.interfaces.Porta;

public class CasaLuxo implements Casa {

	private List<Comodo> comodos;
	private Piso piso;
	private Parede parede;
	private Porta porta;

	public CasaLuxo() {
		this.comodos = new ArrayList<Comodo>();
	}

	@Override
	public void addComodo(Comodo comodo) {
		this.comodos.add(comodo);
	}

	@Override
	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	@Override
	public void setParede(Parede parede) {
		this.parede = parede;
	}

	@Override
	public void setPorta(Porta porta) {
		this.porta = porta;
	}

	@Override
	public String toString() {
		String saida = "Casa Luxo - ";

		saida += "Parede: " + parede + " - ";
		saida += "Porta: " + porta + " - ";
		saida += "Piso: " + piso + ", Comodos: [";

		for (Comodo comodo : this.comodos) {
			saida += comodo.getClass().getSimpleName().toString() + ", ";
		}

		saida += "]";

		return saida;
	}
}
