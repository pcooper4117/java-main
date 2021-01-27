package com.techelevator;

import java.util.ArrayList;

public class UsePlayingCards {

	public static void main(String[] args) {
		
		AmericanPlayingCard aUSACard  = new AmericanPlayingCard(1, "HEARTS");
		System.out.println("aUSACard is :");
		aUSACard.showCard();

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(14, "SPADES");
		System.out.println("aUSACard2 is :" );
		aUSACard2.showCard();
		
		AmericanPlayingCard aUSACard3 = new AmericanPlayingCard(-1, "SPADES");
		System.out.println("aUSACard3 is :");
		aUSACard3.showCard();
			
		AmericanPlayingCard aUSACard4 = new AmericanPlayingCard(11, "JASON");
		System.out.println("aUSACard4 is :");
		aUSACard4.showCard();
		
		ItalianPlayingCard anItalianCard1 = new ItalianPlayingCard(13, "SWORDS");
		System.out.println("anItalianCard1 is :");
		anItalianCard1.showCard();
		
		ItalianPlayingCard anItalianCard2 = new ItalianPlayingCard(9, "COINS");
		System.out.println("anItalianCard2 is :");
		anItalianCard2.showCard();
		
		ItalianPlayingCard anItalianCard3 = new ItalianPlayingCard(11, "JASON");
		System.out.println("anItalianCard3 is :");
		anItalianCard3.showCard();
		
		SwissPlayingCard aSwissCard1 = new SwissPlayingCard(13, "ROSES");
		System.out.println("aSwissCard1 is :");
		aSwissCard1.showCard();
		
		SwissPlayingCard aSwissCard2 = new SwissPlayingCard(9, "SHIELDS");
		System.out.println("aSwissCard2 is :");
		aSwissCard2.showCard();
			
		SwissPlayingCard aSwissCard3 = new SwissPlayingCard(10, "ACORNS");
		System.out.println("anSwissCard3 is :");
		aSwissCard3.showCard();
			
		SwissPlayingCard aSwissCard4 = new SwissPlayingCard(11, "JASON");
		System.out.println("anSwissCard4 is :");
		aSwissCard4.showCard();	
		//-------------------------------------------------------------------------------------------------------------
		System.out.println("Start of PolyMorphism examples begin here");
		
		PlayingCard aCard = null; // define a super class that is empty
		
		aCard = aUSACard;  // in this case its going to run the american playing card show card method
		
		
		aCard.showCard();// using superClass object to run a common method in inheritance hierarchy
							// all SubClasses have a showCard() method... Polymorphism will decide what to show
		
		aCard = anItalianCard1 ;
		aCard.showCard();
		
		aCard = aSwissCard1;		// assign a subClass to a super Class object
		aCard.showCard();			// use super class to run methods
	//---------------------------------------------------------------------------------------------------------------------	
	System.out.print( "			Beggining of polymorphism examples using arrayList");
	
	
	ArrayList <PlayingCard> cardList = new ArrayList();
		// add subClass objects to the arrayList of superClass;
		cardList.add(aSwissCard1);// add a subClass object
		cardList.add(anItalianCard1);
		cardList.add(aUSACard);
		cardList.add(aUSACard2);
		cardList.add(aSwissCard2);
					// Loop through the arrayList displaying the card using show card Method
			for(PlayingCard theCard : cardList) {
				theCard.showCard();
			}
		// we dont need to know or card what type of object is in the for loop variable 
			// each time through the loop
		
	}


	
	
	
	//-----------------------------------------------------------------------------------------------
}