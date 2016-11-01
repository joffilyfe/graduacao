package locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private List<Aluguel> alugueis = new ArrayList<Aluguel>();
	private int pontosFidelidade = 0;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void adicionarAluguel(Aluguel aluguel) {
		this.alugueis.add(aluguel);
	}
	
	public String extrato() {
		String saida = "Registro de Alugueis de " + this.nome + "\n";
		double total = 0;
		
		// Contabiliza o valor de cada aluguel
		for (Aluguel aluguel: alugueis) {
			saida += aluguel.getFita().getTitulo() + "\t\t\t R$ " +  aluguel.getSubTotal() + "\n";
			this.pontosFidelidade += aluguel.getPontos();
			total += aluguel.getSubTotal();
		}
		
		saida += "Valor total devido: R$ " + total + "\n";
	    saida += "Você acumulou " + this.pontosFidelidade + " pontos de alugador frequente.\n";

		return saida;
	}
}
