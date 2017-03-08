package me.joffily.figuras;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.Figura;
import me.joffily.interfaces.FiguraComposite;

public class Ponto implements Figura, FiguraComposite {

	List<Figura> figuras;

	public Ponto() {
		this.figuras = new ArrayList<Figura>();
	}

	@Override
	public Double perimetro() {
		return 0.0;
	}

	@Override
	public Double area() {
		return 0.0;
	}

	@Override
	public String desenha() {
		return "Desenhando ponto";
	}

	@Override
	public List<Figura> getFiguras() {
		return this.figuras;
	}

	@Override
	public String toString() {
		return "Ponto [figuras=" + figuras + "]";
	}

	@Override
	public void addFigura(Figura f) {
		this.figuras.add(f);
	}
}
