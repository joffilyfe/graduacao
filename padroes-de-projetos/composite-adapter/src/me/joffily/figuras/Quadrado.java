package me.joffily.figuras;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.Figura;
import me.joffily.interfaces.FiguraComposite;
import me.joffily.interfaces.FiguraImportada;

public class Quadrado implements FiguraImportada, FiguraComposite {
	List<Figura> figuras;

	public Quadrado() {
		this.figuras = new ArrayList<Figura>();
	}

	@Override
	public List<Figura> getFiguras() {
		return this.figuras;
	}

	@Override
	public String draw() {
		return "Quadrado draw";
	}

	@Override
	public Double areaFigura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double perimetroFigura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFigura(Figura f) {
		this.figuras.add(f);
	}
}
