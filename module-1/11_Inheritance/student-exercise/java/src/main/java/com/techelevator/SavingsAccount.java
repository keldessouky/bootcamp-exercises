package com.techelevator;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {

		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public int withdraw(int amountToWithdraw) {
		int savingsFee = amountToWithdraw + 2;
		if (amountToWithdraw > super.getBalance()) {
			return super.getBalance();
		} else if ((super.getBalance() - amountToWithdraw) < 150) {
			return super.withdraw(savingsFee);
		} else {
			return super.withdraw(amountToWithdraw);
		}
	}

}
