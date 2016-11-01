package locadora;
import fita.Alugavel;
import fita.Fita;
import fita.FitaInfantil;
import fita.FitaLancamento;

public class Aluguel {
	  private Alugavel fita;
	  private int diasAlugada;
	  private int pontos;

	  public Aluguel(Alugavel fita, int diasAlugada) {
	    this.fita = fita;
	    this.diasAlugada = diasAlugada;
	  }

	  public Alugavel getFita() {
	    return fita;
	  }

	  public int getDiasAlugada() {
	    return diasAlugada;
	  }

	  public int getPontos() {
		  return this.pontos;
	  }

	  public double getSubTotal() {
		  double total = this.fita.getValor();
		  this.pontos++;

		  // Normal
		  if (this.fita instanceof Fita) {
			  if (this.diasAlugada > 2) {
				  total +=  (diasAlugada - 2) * 1.5;
			  }
		  }

		  // Lançamento
		  if (this.fita instanceof FitaLancamento) {
			  total += this.diasAlugada * 3;

			  if (this.diasAlugada > 1) {
				  this.pontos++;
			  }
		  }

		  // Infantil
		  if (this.fita instanceof FitaInfantil) {
			  if (this.diasAlugada > 3) {
				  total += (this.diasAlugada - 3) * 1.5;
			  }
		  }

		  return total;
	  }
	}
