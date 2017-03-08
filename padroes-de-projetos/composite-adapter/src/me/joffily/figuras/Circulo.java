package me.joffily.figuras;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.Figura;
import me.joffily.interfaces.FiguraComposite;

public class Circulo implements Figura, FiguraComposite {

	List<Figura> figuras;

	public Circulo() {
		this.figuras = new ArrayList<Figura>();
	}

	@Override
	public Double perimetro() {
		return null;
	}

	@Override
	public Double area() {
		return null;
	}

	@Override
	public String desenha() {
		return "Desenhando circulo";
	}

	@Override
	public List<Figura> getFiguras() {
		return this.figuras;
	}

	@Override
	public String toString() {
		return "Circulo [figuras=" + figuras + "]";
	}

	@Override
	public void addFigura(Figura f) {
		this.figuras.add(f);
	}

}
