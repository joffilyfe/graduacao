/*
* @author Marianna V, Joffily F
* @program Singleton exercice
*/

class Incremental {
	private static int contador = 0;
	private int numero;
	private static Incremental instancia;

	private Incremental() {
	}

	public static Incremental getInstancia() {
		if (instancia == null) {
			instancia = new Incremental();
		}

		return instancia;
	}

	public void mostra() {
		System.out.println(++contador);
	}
}

public class Singleton {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Incremental inc = Incremental.getInstancia();
			inc.mostra();
		}
	}
}
