package me.joffily.decorators;

import me.joffily.numeros.Numero;

public abstract class NumeroDecorator extends Numero {
	protected Numero numero;
	
	public NumeroDecorator(Numero numero) {
		this.numero = numero;
	}
	
	@Override
	public String imprime() {
//		return this.numero.getNome() + " + " + nome;
		return "("+ this.numero.imprime() +")" + nome;
	}
}
