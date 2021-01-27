package com.techelevator;

import java.util.ArrayList;
// defining behaviors that must be implemented to be considered a card hand
// if you want to be considered a card hand you must define these behaviors 

public interface CardHand {
	
	public ArrayList<PlayingCard> getHand();  		// returns cards in hand to array list

	public void addCard(PlayingCard aCard);			// Receive playing card and add in hand
	
	public void emptyHand();
													// empty the hand
	public void show();								// Have a way to display all cards in hand

}
