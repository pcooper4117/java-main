package com.techelevator;

public class HomeworkAssignment {
private int earnedMarks; 
private int possibleMarks;
private String submitterName;

// private means members of the class have access 
// outsiders need to use methods

//---------------------------------------------------------------------------------
public int getEarnedMarks() {
	return earnedMarks;
}
public void setEarnedMarks(int earnedMarks) {
	this.earnedMarks = earnedMarks;
}
public int getPossibleMarks() {
	return possibleMarks;
}
public String getSubmitterName() {
	return submitterName;
}
//----------------------------------------------------------------------------------


 public HomeworkAssignment (int possibleMarks, String submitterName) {
	this.possibleMarks = possibleMarks; //set data member to parameter
	this.submitterName = submitterName;
	// a derived attribute or value is one that a method returns
}
	public String getLetterGrade() {
		String letterGrade = "";   // hold letter grade to be returned
	double grade = (double) earnedMarks / possibleMarks; // we are allowed to use data members because this method is members of the classs
		
		if( grade >= 0.90) {
			letterGrade = "A";
			
		}
		else if (grade >= 0.80) {
			letterGrade = "B";
		}
		else if (grade >= 0.70) {
			letterGrade = "C";
		}
		else if (grade >= 0.60) {
			letterGrade = "D";
		}
		else {
		 letterGrade = "F";
		}
		return letterGrade; 
		
		
}
}