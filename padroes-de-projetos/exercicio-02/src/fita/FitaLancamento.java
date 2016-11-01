package fita;

public class FitaLancamento implements Alugavel {
	private String titulo;
	private static final double valor = 0;

	public FitaLancamento(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public double getValor() {
		return this.valor;
	}
}
