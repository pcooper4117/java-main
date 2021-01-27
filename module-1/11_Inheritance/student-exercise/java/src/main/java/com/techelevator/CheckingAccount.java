package com.techelevator;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		// TODO Auto-generated constructor stub
	}
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	
	}
	// check to see if the account is over or equal to 100
	// if account is less than 0 take 10
	//
	public int withdraw (int withdraw) {
		if (getBalance() - withdraw >= -100){
			super.withdraw(withdraw);
			if (super.getBalance () < 0) {
				super.withdraw(10);
			}
		}
		return getBalance();
	}
	
	
	

}
