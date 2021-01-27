package com.techelevator;

public  abstract class  PlayingCard {
	// abstract is an attribute applied to a class that can never be instantiated 
	// and abstract class can only be a super class
	// it provides a generic description of an object, the subclass refine the description
	protected int value;  // only members of this class or subclass can access  
	private String color;    
	private String suit;     
	
	// protected violates strict interpretation of encapsulation
	
	public PlayingCard(int value, String suit, String color) {
		this.value = value;
		this.suit  = suit;
		this.color = color; // this keyword always means current object - current object is to left of dot that invoked method
	}
	
	public int getValue() {
		return value;
	}
	public String getColor() {
		return color;
	}
	public String getSuit() {
		return suit;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	@Override   // Ask compiler to verify this is a proper Override - same name, same parameters, same return-type
	public String toString() {
		return "PlayingCard [value=" + value + ", color=" + color + ", suit=" + suit + ", getValue()=" + getValue()
				+ ", getColor()=" + getColor() + ", getSuit()=" + getSuit() + "]";
	}
	
	@Override   // Ask compiler to verify this is a proper Override - same name, same parameters, same return-type
	public boolean equals(Object obj) {  // Receive any type of Object
		if (this == obj) {  // If compare a PlayingCard to itself
			return true;
		}
		if (obj == null) {  // If compare to an undefined PlayingCard
			return false;
		}
		if (getClass() != obj.getClass()) {  // If compare to an object of a different class
			return false;                    // getClass() return the Class of an object
		}
		PlayingCard other = (PlayingCard) obj;  // Define a PlayingCard for the object that was passed
		if (color != other.color) {
			return false;
		}
		if (suit != other.suit) {
			return false;
		}
		if (value != other.value) {
			return false;
		}
		return true;
	}
//		an abstract method is defined when a super class wants to ensure any subclass defines/overrrides the method
	// we dont know what the abstract method should do in the super class, we just know we need to have the method
	//		SUBCLASSES MUST OVERRIDE THIS METHOD
	public abstract void showCard() {}  // Required for Polymorphism - does nothing
		// uses ; instead of braces
}
