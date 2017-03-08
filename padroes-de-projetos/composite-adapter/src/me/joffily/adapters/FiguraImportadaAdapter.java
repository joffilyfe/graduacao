package me.joffily.adapters;

import me.joffily.interfaces.Figura;
import me.joffily.interfaces.FiguraImportada;

public class FiguraImportadaAdapter implements Figura {

	FiguraImportada figura;

	public FiguraImportadaAdapter(FiguraImportada figura) {
		this.figura = figura;
	}

	@Override
	public Double perimetro() {
		return this.figura.perimetroFigura();
	}

	@Override
	public Double area() {
		return this.figura.areaFigura();
	}

	@Override
	public String desenha() {
		return this.figura.draw();
	}

}
