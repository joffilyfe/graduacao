package me.joffily.bancos;

import me.joffily.interfaces.BankMediator;
import me.joffily.model.Bank;

public class Bradesco extends Bank {
	public Bradesco(BankMediator mediator) {
		super(mediator);
	}

	@Override
	public void receive(String message, Bank from) {
		System.out.println(String.format("Bradesco recebeu: %s, de: %s.", message, from));
	}

	@Override
	public void transfer(String message, Bank bank) {
		this.mediator.transfer(message, bank, this);
	}

	@Override
	public String toString() {
		return "Bradesco";
	}
}
