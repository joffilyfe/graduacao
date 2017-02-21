package me.joffily;

import me.joffily.builders.ComodoBuilder;
import me.joffily.enums.ComodoEnum;
import me.joffily.enums.MaterialEnum;
import me.joffily.enums.ParedeEnum;
import me.joffily.enums.PisoEnum;
import me.joffily.enums.PortaEnum;
import me.joffily.factory.FactoryCasa;
import me.joffily.interfaces.Casa;

public class Teste {
	public static void main(String args[]) {

		FactoryCasa factoryCasa = new FactoryCasa();

		Casa casaBasica = factoryCasa.criarCasaBasica();
		Casa casaConforto = factoryCasa.criarCasaConforto();

		// Cria builder para um comodo
		ComodoBuilder quartoSimples = new ComodoBuilder(ComodoEnum.QUARTO);
		quartoSimples.addPorta(PortaEnum.MDF).addParede(ParedeEnum.GESSO).setPiso(PisoEnum.CERAMICA)
				.addMaterial(MaterialEnum.FERRO);

		// Cria Builder para um quarto Conforto
		ComodoBuilder quartoConforto = new ComodoBuilder(ComodoEnum.QUARTO);

		// Cria Builder para banheiro
		ComodoBuilder banheiroBuilder = new ComodoBuilder(ComodoEnum.BANHEIRO);

		// Adiciona o comodo a casa
		casaBasica.addComodo(quartoSimples.build());
		casaConforto.addComodo(quartoConforto.build());
		casaConforto.addComodo(banheiroBuilder.build());

		System.out.println(casaBasica);
		System.out.println(casaConforto);
	}
}
