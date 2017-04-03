import me.joffily.model.Semaforo;

public class Programa {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();

		semaforo.on();
		semaforo.tick();
		semaforo.panic();
		semaforo.tick();
		semaforo.tick();
		semaforo.tick();
		semaforo.off();
		semaforo.on();

	}

}
