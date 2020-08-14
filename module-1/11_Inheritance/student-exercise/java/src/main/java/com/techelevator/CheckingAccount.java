package com.techelevator;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String accountHolderName, String accountNumber) {

		super(accountHolderName, accountNumber);
	}

	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {

		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public int withdraw(int amountToWithdraw) {

		int overDraftPenalty = amountToWithdraw + 10;

		if (super.getBalance() - amountToWithdraw < 0) {
			if ((super.getBalance() - amountToWithdraw) <= -100) {
				return super.getBalance();
			} else
				return super.withdraw(overDraftPenalty);
		}
		return super.withdraw(amountToWithdraw);
	}

}
