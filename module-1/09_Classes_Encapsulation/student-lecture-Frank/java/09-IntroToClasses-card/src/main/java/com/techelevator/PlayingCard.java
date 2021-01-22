package com.techelevator;

public class PlayingCard {

	// this a class to represent a playing card
	// a class has data (variables) and behaviors are the methods
	// we have identified the following characteristics for a playing card:
	// 			value
	//			suit
	//			color
	//			shape
	//			face up
	
	// the characteristics or data for a class may also be called attributes
	// the attributes for a class are defined as memeber variables
	// a variable is a "memeber variable" if its defined in a class
	// to define a member variable: access - public anyone can access it 
	//									   - private  only members of the class can access it
	//							  datatype
	//							  name
	
	
	// using private on variables implements encapsulation
	// encapsulation means we are protecting the data  from access outside its class
	/************************************************************************************
	 * data members of class
	 ***********************************************************************************/
	private int 		 cardValue; // ace = 1 Jack=11 queen=12 king=13
	private String		 cardSuit; 
	private String 		 cardColor;
	private String		 cardShape;
	private boolean		 faceUp;

	
	/*************************************************************************************
	 * methods for class
	 */
	//---------------------------------------------------------------------------------------
	// 		Constructors - initialize new objects - run automatically by java
	//Every class should provide constructor method to initialize objects of the class
	// if constructors are not provided java runs a default ctor it initialize
	// the java default constructor is going to set objects = null bolean=false
	// method overload is method with same name but with different paramaters
	// constructors are always overloaded
	//
	
	PlayingCard(){ // default constructor takes no args and asssigns default values to data member
		cardValue = 13 ;
		cardColor = "Red";
		cardSuit = "Diamonds";
		cardShape = "circle";
		faceUp = true;
	}
	
	// to allow a user to define any PlayingCard we need to create a ctor that takes prameters for the data value
			PlayingCard(int value, String color, String suit){
				cardValue = value ;
				cardColor = color;		// values passed from user
				cardSuit = suit;
				cardShape = "circle";
				faceUp = true;
			}
	
	//-------------------------------------------------------------------------------------------------------------
			// class methods to support the class
			// getters/setters - methods to retrieve valuse from the object
			//					and change values from the object
			//	due to encapsulation (making data members private) there is no accsess to data outside of class
			
			// Getters\Setters allow us to control access from outside the method
			// getters and setters gereated by elcipse folllow the convetion for getters and setters
			
			public int getCardValue() {
				return cardValue;
			}

			public void setCardValue(int cardValue) {
				this.cardValue = cardValue;
			}

			public String getCardSuit() {
				return cardSuit;
			}

			public void setCardSuit(String cardSuit) {
				this.cardSuit = cardSuit;
			}

			public String getCardColor() {
				return cardColor;
			}

			public void setCardColor(String cardColor) {
				this.cardColor = cardColor;
			}

			public String getCardShape() {
				return cardShape;
			}

			public void setCardShape(String cardShape) {
				this.cardShape = cardShape;
			}

			public boolean isFaceUp() {	// Conventional name for boolean getter
				return faceUp;
			}

			public void setFaceUp(boolean faceUp) {
				this.faceUp = faceUp;
			}

	// Not all data members need to have getters and setters- if you wanna limit access you can
	// toString() which will return a playingCard to a string
	public String toString() {
		return "PlayingCard [cardValue=" + cardValue + ", cardSuit=" + cardSuit + ", cardColor=" + cardColor
				+ ", cardShape=" + cardShape + ", faceup=" + faceUp + "]";
	}
}
