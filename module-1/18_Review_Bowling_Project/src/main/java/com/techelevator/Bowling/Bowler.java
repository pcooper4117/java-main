package com.techelevator.Bowling;

import java.util.ArrayList;

public class Bowler {
private int teamNumber;
private int bowlerNumber;
private String bowlerName;
private ArrayList <Integer> scores;

public Bowler(int teamNumber, int bowlerNumber, String bowlerName, ArrayList<Integer> scores) {
	this.teamNumber 	= teamNumber;
	this.bowlerNumber   = bowlerNumber;
	this.bowlerName 	= bowlerName;
	this.scores 		= scores;
	
}

public int getTeamNumber() {
	return teamNumber;
}
public void setTeamNumber(int teamNumber) {
	this.teamNumber = teamNumber;
}
public int getBowlerNumber() {
	return bowlerNumber;
}
public void setBowlerNumber(int bowlerNumber) {
	this.bowlerNumber = bowlerNumber;
}
public String getBowlerName() {
	return bowlerName;
}
public void setBowlerName(String bowlerName) {
	this.bowlerName = bowlerName;
}
public ArrayList<Integer> getScores() {
	return scores;
}
public void setScores(ArrayList<Integer> scores) {
	this.scores = scores;
}
// Define methods to get derived from this class for sum and average
// Method to Return the sum of scores as an int
// Method names for Derived vales are usually prefixed with the word get followed by name of derived value
public int getSum() {	// all the data we need is in the class no parameters needed
	int sum = 0;  // Define a variable for the return value
	for(int i = 0; i < scores.size(); i++ )
		sum = sum + scores.get(i);
	
	return sum;
}

// method to return the average of the scores
public double getAverage() {
	double average = 0;
	average = this.getSum() / scores.size();
		
		return average;
}


@Override
public String toString() {
	return "Bowler [teamNumber=" + teamNumber + ", bowlerNumber=" + bowlerNumber + ", bowlerName=" + bowlerName
			+ ", scores=" + scores + ", getTeamNumber()=" + getTeamNumber() + ", getBowlerNumber()=" + getBowlerNumber()
			+ ", getBowlerName()=" + getBowlerName() + ", getScores()=" + getScores() + ", hashCode()=" + hashCode()
			+ "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bowlerName == null) ? 0 : bowlerName.hashCode());
	result = prime * result + bowlerNumber;
	result = prime * result + ((scores == null) ? 0 : scores.hashCode());
	result = prime * result + teamNumber;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Bowler other = (Bowler) obj;
	if (bowlerName == null) {
		if (other.bowlerName != null)
			return false;
	} else if (!bowlerName.equals(other.bowlerName))
		return false;
	if (bowlerNumber != other.bowlerNumber)
		return false;
	if (scores == null) {
		if (other.scores != null)
			return false;
	} else if (!scores.equals(other.scores))
		return false;
	if (teamNumber != other.teamNumber)
		return false;
	return true;
}
}
