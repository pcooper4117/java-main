package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		System.out.println( "Welcome to Patricks conversion program!");

		Scanner userInput = new Scanner(System.in);

		String aLine = " ";

		System.out.println("Please enter a  the length: ");
		 aLine = userInput.nextLine();

		Double valueEntered = Double.parseDouble(aLine);

		System.out.println("Is the length in (m)eter or (f)eet?");

		String theValue = userInput.nextLine();

		if(theValue.equals ("m")) {
			System.out.println((valueEntered * 0.3048) +  "f is " + (valueEntered + "meters")); 
			  
		 }else if  (theValue.equals("f")){
				 System.out.println(valueEntered + "f" + (( valueEntered * 3.2808399) + "m"));
	}

}
}