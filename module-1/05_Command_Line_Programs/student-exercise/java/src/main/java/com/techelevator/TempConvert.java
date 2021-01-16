package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
System.out.println( "Welcome to Patricks tempurature conversion program!");

Scanner userInput = new Scanner(System.in);

String aLine = " ";

System.out.println("Please enter a Temperature");
 aLine = userInput.nextLine();

Double valueEntered = Double.parseDouble(aLine);

System.out.println("Is the temperature in (C)elsius or (F)ahrenheit?");

String theValue = userInput.nextLine();

if(theValue.equals ("C")) {
	System.out.println(((valueEntered * 9 / 5) + 32) +  "F is " + (valueEntered + "C")); 
	  
 }else if  (theValue.equals("F")){
		 System.out.print(((valueEntered - 32) * 5 / 9) + "C is " + (valueEntered + "F"));

	 }
 
		
	}
}
