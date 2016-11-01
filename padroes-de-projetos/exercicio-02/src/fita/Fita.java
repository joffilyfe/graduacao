package fita;

public class Fita implements Alugavel {
	private String titulo;
	private static final double valor = 2;

	public Fita(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public double getValor() {
		return this.valor;
	}
}
