package me.joffily.model;

import me.joffily.interfaces.BankMediator;

public abstract class Bank {
	protected BankMediator mediator;

	public Bank(BankMediator mediator) {
		this.mediator = mediator;

		/*
		 * O banco já possui acesso ao mediador, então podemos nos registrar
		 * diretamente do construtor.
		 */
		mediator.addBank(this);
	}

	public abstract void receive(String message, Bank from);

	public abstract void transfer(String message, Bank to);
}
