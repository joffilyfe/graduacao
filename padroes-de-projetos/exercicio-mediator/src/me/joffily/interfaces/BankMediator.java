package me.joffily.interfaces;

import me.joffily.model.Bank;

public interface BankMediator {
	public void addBank(Bank bank);

	public void transfer(String message, Bank to, Bank from);
}
