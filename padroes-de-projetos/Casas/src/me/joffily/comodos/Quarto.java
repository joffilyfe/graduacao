package me.joffily.comodos;

import me.joffily.interfaces.Material;
import me.joffily.interfaces.Parede;
import me.joffily.interfaces.Porta;

public class Quarto extends ComodoAbstrato {
	@Override
	public String toString() {
		String saida = "Quarto - ";
		for (Material material : this.getMateriais()) {
			saida += "Material: " + material + "\n";
		}

		for (Parede parede : this.getParedes()) {
			saida += "Parede: " + parede + "\n";
		}

		for (Porta porta : this.getPortas()) {
			saida += "Porta: " + porta + "\n";
		}

		return saida;
	}
}
