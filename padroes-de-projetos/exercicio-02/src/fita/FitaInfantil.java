package fita;

public class FitaInfantil implements Alugavel {
	private String titulo;
	private static final double valor = 1.5;

	public FitaInfantil(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public double getValor() {
		return this.valor;
	}
}
