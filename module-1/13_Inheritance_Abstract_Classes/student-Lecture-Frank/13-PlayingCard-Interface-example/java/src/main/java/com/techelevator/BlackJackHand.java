package com.techelevator;

import java.util.ArrayList;
// black jack hand is a "type of" == interface
public class BlackJackHand	 implements CardHand {

	private int numCardsInHand = 2;		//Starting number of cards in hand
	
	private ArrayList<PlayingCard> aHand;  // represent the hand as arrayList
	
	public BlackJackHand() {
		aHand = new ArrayList<PlayingCard>(numCardsInHand);
	}
	
	@Override
	public ArrayList<PlayingCard> getHand() {
		return aHand;
	}
// we need to override the methods by the cardHand interface
	@Override
	public void addCard(PlayingCard aCard) { // arrayList add to add card to hand
		aHand.add(aCard);
		numCardsInHand++;
	}

	@Override
	public void emptyHand() {
		aHand.clear();   					// to empty the hand

	}

	@Override
	public void show() {
		for (PlayingCard aCard : aHand)
		{
			System.out.println(aCard);
		}
			return;
	}
	// methods to provide additional functionality beyond what is required by the cardHand interface
	// do no code override to ask the compliler to verify they are proper overrides since they are not overrrides
	public void dealHand(CardDeck aDeck) {
		for (int i=0; i < numCardsInHand; i++ ) {
			aHand.add(aDeck.dealCard());
		}	
	}
	
}
	
