package com.techelevator;

public class HotelReservation {
public String name;
public int numberOfNights;
public Double estimatedTotal;




HotelReservation(String name, int numberOfNights){
	this.name = name;
	this.numberOfNights = numberOfNights;
	this.estimatedTotal = 59.99;
	return;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumberOfNights() {
	return numberOfNights;
}

public void setNumberOfNights(int numberOfNights) {
	this.numberOfNights = numberOfNights;
}

public Double getEstimatedTotal() {
	return estimatedTotal;
}

public void setEstimatedTotal(Double estimatedTotal) {
	this.estimatedTotal = estimatedTotal;
}


	
	public void cleaningAndMiniBar( boolean miniBarUsed, boolean requiresCleaning) {
	if (miniBarUsed == true){
	
		 this.estimatedTotal += 12.99;
		 }
	
		if (requiresCleaning == true) {
			
		this.estimatedTotal += 34.99;
	}
	}
	@Override
	public String toString() {
		return "HotelReservation [name=" + name + ", numberOfNights=" + numberOfNights + ", estimatedTotal="
				+ estimatedTotal + "]";
	}
	
}
