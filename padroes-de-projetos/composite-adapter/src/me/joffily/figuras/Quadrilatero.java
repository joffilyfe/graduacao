package me.joffily.figuras;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.Figura;
import me.joffily.interfaces.FiguraComposite;

public class Quadrilatero implements Figura, FiguraComposite {

	List<Figura> figuras;

	public Quadrilatero() {
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
		return null;
	}

	@Override
	public List<Figura> getFiguras() {
		return this.figuras;
	}

	@Override
	public String toString() {
		return "Quadrilatero [figuras=" + figuras + "]";
	}

	@Override
	public void addFigura(Figura f) {
		this.figuras.add(f);
	}

}
