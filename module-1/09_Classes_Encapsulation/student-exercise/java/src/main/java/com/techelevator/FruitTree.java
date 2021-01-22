package com.techelevator;

public class FruitTree {
	
	
private String typeOfFruit;
private int piecesOfFruitLeft;

public String getTypeOfFruit(){
	return typeOfFruit;	
}
 public int getPiecesOfFruitLeft() {
	 return piecesOfFruitLeft;
 }
FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
	this.typeOfFruit = typeOfFruit; 
	this.piecesOfFruitLeft = piecesOfFruitLeft;
	
}

public boolean pickFruit (int numberOfPiecesToRemove) {
	
	if (piecesOfFruitLeft < numberOfPiecesToRemove ) {
		return false;
	}
	if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
		piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
	return false;
	}
return true;	
}
}
