package com.techelevator;

/**
 * CreditCardAccount
 */
public class CreditCardAccount implements Accountable {
	
	private String accountHolder;
	private String accountNumber;
	private int debt;



	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDebt() {
		return debt;
	}

	/*******************************************************************
	 * Place the code for  your CreditCard class here
	 *******************************************************************/

	public CreditCardAccount(String accountHolder, String accountNumber){
		this.accountHolder =  accountHolder;
		this.accountNumber = accountNumber;
	}


	public int pay (int amountToPay) {
		debt = debt - amountToPay;
		return debt;

	}

	public int charge (int amountToCharge) {
		debt = debt + amountToCharge;
		return debt;

	}


	public int getBalance() {   // return the negative amount of debt
		if (debt >= 0) {
			debt = 0 - debt;
		}
		return debt;
	}

}

