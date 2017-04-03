package me.joffily.model;

import java.util.ArrayList;
import java.util.List;

import me.joffily.interfaces.BankMediator;

/*
 * Classe responsável por enviar mensagem para outras classes
 * previamente registradas, por meio de uma interface padrão.
 */
public class Mediator implements BankMediator {

	private List<Bank> banks;

	public Mediator() {
		this.banks = new ArrayList<Bank>();
	}

	@Override
	public void addBank(Bank bank) {
		this.banks.add(bank);
	}

	@Override
	public void transfer(String message, Bank to, Bank from) {
		// Verifica se o bank faz parte do mediator
		// Também verifica se o banco está fazendo uma
		// transferência para ele mesmo
		if (this.banks.contains(to) && !from.equals(to)) {
			to.receive(message, from);
		}
	}

}
