package me.joffily.numeros;

import me.joffily.decorators.NumeroDecorator;

public class NumeroDois extends NumeroDecorator {
	
	public NumeroDois(Numero numero) {
		super(numero);
		this.nome = "2";
	}
}
