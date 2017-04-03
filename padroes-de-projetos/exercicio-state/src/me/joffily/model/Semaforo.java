package me.joffily.model;

import me.joffily.interfaces.State;
import me.joffily.states.AmareloIntermitente;
import me.joffily.states.Panico;

public class Semaforo {
	private State cor;

	public Semaforo() {
		this.cor = new AmareloIntermitente();
		System.out.println(String.format("O semaforo iniciado na cor: %s", this.cor));
	}

	public void tick() {
		if (this.cor instanceof Panico) {
			System.out.println("Semaforo em pânico");
			return;
		}

		if (this.cor instanceof AmareloIntermitente) {
			System.out.println("Amarelo Intermitente");
			return;
		}

		this.cor = this.cor.tick();
		System.out.println(String.format("O semaforo mudou para: %s", this.cor));
	}

	public void panic() {
		if (this.cor instanceof Panico) {
			System.out.println("Semaforo em pânico");
			return;
		}

		if (this.cor instanceof AmareloIntermitente) {
			System.out.println("Amarelo Intermitente");
			return;
		}

		this.cor = this.cor.panic();
		System.out.println(String.format("O semaforo mudou para: %s", this.cor));
	}

	public void off() {
		if (this.cor instanceof Panico) {
			System.out.println("Semaforo em pânico");
			return;
		}

		if (this.cor instanceof AmareloIntermitente) {
			System.out.println("Amarelo Intermitente");
			return;
		}

		this.cor = this.cor.off();
		System.out.println(String.format("O semaforo mudou para: %s", this.cor));
	}

	public void on() {
		this.cor = this.cor.on();
		System.out.println("Sinal reinicializado.");
		System.out.println(String.format("O semaforo mudou para: %s", this.cor));
	}

	public void status() {
		System.out.println(String.format("Status: %s", this.cor));
	}
}
