package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
System.out.println( "Please enter the Fibionacci number");
Scanner userInput = new Scanner(System.in);

String aLine = " ";
aLine = userInput.nextLine();
int theNumber = Integer.parseInt(aLine);
System.out.println( "You entered " + theNumber);
 int sum = 0;
for (int i = 0; i < theNumber; i ++){
	sum = (( sum + theNumber + i++ ) - i + i++ );
	System.out.println(sum);
	}
	}
}
