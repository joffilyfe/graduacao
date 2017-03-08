package me.joffily.programa;

import me.joffily.numeros.Numero;
import me.joffily.numeros.NumeroDois;
import me.joffily.numeros.NumeroUm;

public class Manipulacao {

	public static void main(String[] args) {
		Numero numero = new NumeroUm();
		
		Numero numDecorado = new NumeroDois(numero);
		numero = new NumeroDois(numDecorado);

		
		System.out.println(numero.imprime());

	}

}
