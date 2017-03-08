package me.joffily.programa;

import me.joffily.adapters.FiguraImportadaAdapter;
import me.joffily.figuras.Circulo;
import me.joffily.figuras.Losango;
import me.joffily.figuras.Ponto;
import me.joffily.figuras.Quadrado;

public class Manipulacao {

	public static void main(String[] args) {

		// Composite
		Ponto ponto = new Ponto();
		Circulo circulo = new Circulo();
		circulo.addFigura(ponto);

		System.out.println(circulo);

		// Adapter para Figura importada
		Quadrado quadrado = new Quadrado();
		FiguraImportadaAdapter quadradoAdapter = new FiguraImportadaAdapter(quadrado);
		System.out.println(quadradoAdapter.desenha());

		// Adapter para Figura importada
		Losango losango = new Losango();
		FiguraImportadaAdapter losangoAdapter = new FiguraImportadaAdapter(losango);
		System.out.println(losangoAdapter.desenha());
	}

}
