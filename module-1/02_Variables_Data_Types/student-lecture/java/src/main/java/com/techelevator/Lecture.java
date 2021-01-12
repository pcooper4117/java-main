// slash slash indicates comment
// a comment is info for a human
/* start of a block comment 

 */ //end of block code	

package com.techelevator;   // the package for this application

public class Lecture {// a class within th application

	public static void main(String[] args) {  // function in application
											// every application has at least one main() function
		// variables are used to hold the data for the program
		// data and understanding data is funamental to writing fundamental program
		// in java a variable is defined: datatype name;
		//									datatype name = initial-value
		//	if an initial value is not specified when you define the variable
		//  its content is unknown which may lead to errors
		// its a good idea to initialize variables
		// variable names must be unique within a block of code (between{})
		// if the value is numeric, without a decimal point : int
		// if the value is numeric with decimal:			 double
		// if the value is single character:		 		char
		// if the value is multiple characters or words : 	string
		// if the value is true or false:					boolean
		// string is special data type
		//
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
			int numberOfExercises = 26;
		//System.out.println(numberOfExercises);
			/*
System.out.println("The value in numberOfExercises is " + numberOfExercises;)

		
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
			double half = 0.5;

		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "Tech Elevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanuage = "Java"; 
	
		
		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;
		System.out.println("Value of pi is: " +pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Patrick Cooper";
		System.out.println ("my name is "+ myName);
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
int numMouseButtons = 2;
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
double pctBatteryLife = 0;
System.out.println("Battery life: " + pctBatteryLife);
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
int diff = 121 - 127;
System.out.println ("diff= " + diff);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
double sum = 12.3 + 32.1;
System.out.println (diff);
		/*
		12. Create a String that holds your full name.
		*/
String fullName = "Pat Cooper";
System.out.println("fullName: "  + fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
String Joel = fullName+ "Hello";
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
fullName  =  fullName + " Esquire";

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
fullName += " Esquire";
System.out.println("fullName is now " + fullName );
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
String Movie =  "Saw";
Movie +=" 2";
System.out.println(Movie);
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
Movie = Movie + 0;
System.out.println(Movie);
		/*
		18. What is 4.4 divided by 2.2?
		*/
System.out.println ("4.4 / 2.2 is: " + 4.4 / 2.2);
		/*
		19. What is 5.4 divided by 2?
		*/
System.out.println ("5.4 / 2 is : "+ 5.4 / 2);
		/*
		20. What is 5 divided by 2?
		*/
System.out.println( "5 / 2 is: " + 5 / 2 );
		/*
		21. What is 5.0 divided by 2?
		*/
System.out.println( "5.0 / 2 is: " + 5.0 / 2 );
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
System.out.println( "66.6 / 100 is: " + 66.6 / 100 );

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
System.out.println( "5.0 / 2 remainder is: " + 5.0 % 2 );

		/*
		24. What is 1,000,000,000 * 3?
		*/
System.out.println( "1000000000 * 3 is: " + 1000000000 * 3 );
System.out.println( "1000000000L * 3L is: " + 1000000000L * 3L );

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
boolean doneWithExercises = false;
System.out.println ("doneWithExcercises= "+ doneWithExercises);
		/*
		26. Now set doneWithExercise to true.
		*/
		
	}

}
