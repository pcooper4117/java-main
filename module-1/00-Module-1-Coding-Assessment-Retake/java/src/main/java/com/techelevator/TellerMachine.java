package com.techelevator;

public class TellerMachine {
public String manufacturer;
public int deposits;
public int withdrawls;
public int balance =  (deposits - withdrawls);
 

TellerMachine(String manufacturer, int deposits, int withdrawls){
	this.manufacturer = manufacturer;
	this.deposits = 0;
	this.withdrawls = 0;
	return;
}



public String getManufacturer() {
	return manufacturer;
}


public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}


public int getDeposits() {
	return deposits;
}


public void setDeposits(int deposits) {
	this.deposits = deposits;
}


public int getWithdrawls() {
	return withdrawls;
}


public void setWithdrawls(int withdrawls) {
	this.withdrawls = withdrawls;
}


public int getBalance() {
	return balance;
}


public void setBalance(int balance) {
	this.balance = balance;
}
String cardNumber = " ";

public boolean cardNumber(boolean beginsWith5, boolean beginsWith4, boolean beginsWith3 ) {
	if (cardNumber.startsWith("5") && cardNumber.length() == 16 ) {
			return true;
	}
	else if ( cardNumber.startsWith("4") &&  cardNumber.length() == 16 || cardNumber.length() == 13) {
			return true;
	}
	else if (cardNumber.startsWith("3") && cardNumber.indexOf(1) == 4 && cardNumber.indexOf(1) == 7) {
			return true;
	}
	else {
			return false;
	}
}


@Override
public String toString() {
	return "ATM - {manufacturer} " + manufacturer + ", {balance}" + balance;
}





}
