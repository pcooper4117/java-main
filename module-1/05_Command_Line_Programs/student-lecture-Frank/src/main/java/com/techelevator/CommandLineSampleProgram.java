package com.techelevator;
// if we use somthing that is not part of standard java language we need to import code that supports it
import java.util.Scanner;	// give me accesss to scanner stuff provided my java

public class CommandLineSampleProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Frank's Command Line Sample Program");
		// this code will read input from keyboard and process it.
		// define an object to represent the key board in this program
		// scanner is the class that java provides for us to define keyboard objects
		// since java provides system.in to represent keyboard
		// 			we need to associate our program object with system.in
		Scanner userInput = new Scanner(System.in); // create scanner object for the keyboard;
		
		String aLine = " "; // this will hold a line of input from the keyboard
		System.out.println ("Please enter a line: ");
		aLine = userInput.nextLine(); // go to the userInput object and get to next line
		
		System.out.println ("You entered the line: " + aLine); //display line entered line by user
		
		System.out.println ("Please Enter a whole number: ");
	int aNumber = userInput.nextInt();
	userInput.nextLine();
		System.out.println ("You entered the number: " + aNumber);
		
		// we want to divide what the user entered by two to get half the value
		// we stored what they entered as a string which cannot be used in arithmatic 
		// we need to convert the value in a string to do arithmetic
		// we need to convert it
		// we can use the integer.parseINT fucntion or .parseDouble to convert string to numeric
		//m
		int theNumber = Integer.parseInt(aLine);
		System.out.println ( "Half of that number is: " + aNumber / 2);
	// get a series of values from a user and determine the sum and the average
		// 1 ask user to enter a value or indicate they are done( "n" == done)
		// 2 if not done:
		// 			a convert value entered into numeric
		//   		b add converted value to a sum
		// 			c count that they entered number
		//	3 Once all numbers are entered, display sum and average;
		
		String theValue = " ";  // this is gonna hold value entered by user
		double sum = 0;    		// this will hold value of sum of the value they entered, double because were alloweing decimals
		int numNums = 0;		// gonna hold values they enter
		// We are using a while loop because we dont know how many values the user will enter
		// the while loop will loop while a condition is true- and exit when condition is false
		// in this case we wil specify a never ending loop while looping while true
		// which means we wil use break when we decide it needs to happen
		//
		while (true) { // loop untill end of time or untill we break out
			System.out.println ("Enter a value of 'N' to end");
			// to test a String for equals we CANNOT use the normal == or!=
			// we have to use the .equals method
					theValue = userInput.nextLine(); // get input from user
					if ( theValue.equals("N")) {			//if entered N end the loop
			break; 
		}
		double valueEntered = Double.parseDouble(theValue); 
		sum = sum  + valueEntered; 
		numNums++ ;// 
	}
			System.out.println( "The sum of the numbers is: " + sum );
			System.out.println ( "You entered " + numNums + "numbers");
			System.out.println ("The avereage of the numbers: " + (sum / numNums));
}
}