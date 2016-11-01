package locadora;
import fita.Fita;
import fita.FitaInfantil;
import fita.FitaLancamento;

public class Locadora {
	  public static void main(String[] args) {
	    Cliente c1 = new Cliente("Juliana");

	    c1.adicionarAluguel(new Aluguel(new Fita("O Malandro"), 3));
	    c1.adicionarAluguel(new Aluguel(new Fita("Men in Black"), 2));
	    c1.adicionarAluguel(new Aluguel(new FitaLancamento("Jurassic Park III"), 3));
	    c1.adicionarAluguel(new Aluguel(new FitaLancamento("Planeta dos Macacos"), 4));
	    c1.adicionarAluguel(new Aluguel(new FitaInfantil("Pateta no Planeta dos Macacos"), 10));
	    c1.adicionarAluguel(new Aluguel(new FitaInfantil("O Rei Leão"), 30));

	    System.out.println(c1.extrato());
	  }
	}
