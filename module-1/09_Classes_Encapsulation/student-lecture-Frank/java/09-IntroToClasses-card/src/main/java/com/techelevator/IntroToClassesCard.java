package com.techelevator;

public class IntroToClassesCard {
        //------------------------------------------------------------------------------------------------------------
        // Application program for the Intro To Classes App
        //------------------------------------------------------------------------------------------------------------
    //
	//  	Every Java application must have one method called main
	//	 main() is where execution starts for any java application
	
	//	 main is the application program
	//
	//	application program instantiates and manipulates objects to get its work done
	// 
	public static void main(String[] args) {
        /*
        *  This program will demonstrate several concepts presented in the Java cohort
        *  in the topic Introduction to Classes 		
        */
	// to instantiate and object:
		
//		classname	objName	= new ClassName()  the() after the class name causes the constructor for the class to be run
		//										if no constructor is found a default constructor is made
		PlayingCard aCard = new PlayingCard();
			aCard   	= new PlayingCard();
		
			System.out.println(aCard);  // display aCard	
									// system.out.println - display Strings
									// whatever you give it inside () must be convertible to string
		//							   aCard is a playingCard type - not a string
									// System.out.println look to a method convert aCard to String
									// a class may provide a method called toString() to return a string
									// 			String representation of an object of the class
									// System.out.println looks for a toString()  for playing card class
									//  if a toString method is not found for the class of an object it looks to any class 
									//			in the family of classes that the object belongs to
				
			
			PlayingCard anotherCard = new PlayingCard(1,"Black", "Clubs");
			System.out.println("anotherCard is: " + anotherCard);
			
			PlayingCard card3 = new PlayingCard(9,"Red", "Hearts");
			System.out.println("anotherCard is: " + anotherCard);
			
			
			System.out.println( "The value of card3 is: "+ card3.getCardValue());
			card3.setCardValue(1);
			System.out.println( "The value of card3 is: "+ card3.getCardValue());
	}
}
		