package me.joffily;

import me.joffily.bancos.BancoDoBrasil;
import me.joffily.bancos.Bradesco;
import me.joffily.bancos.CaixaEconomica;
import me.joffily.bancos.Itau;
import me.joffily.model.Mediator;

public class Main {

	public static void main(String[] args) {
		Mediator bancosMediator = new Mediator();

		BancoDoBrasil bb = new BancoDoBrasil(bancosMediator);
		CaixaEconomica cef = new CaixaEconomica(bancosMediator);
		Itau itau = new Itau(bancosMediator);
		Bradesco bradesco = new Bradesco(bancosMediator);

		// A chamada ao registro do mediator
		// É feita assim que o banco é instanciado
		// No seu próprio construtor.

		bb.transfer("R$ 5.000.000", cef);
		bradesco.transfer("R$ 200.000.00", bb);
		cef.transfer("R$ 100.000,00", itau);

		/*
		 * Uma melhoria seria implementar um algoritmo que ao passar um código
		 * do banco, o mediator buscaria o banco e faria a transferencia.
		 */
	}

}
