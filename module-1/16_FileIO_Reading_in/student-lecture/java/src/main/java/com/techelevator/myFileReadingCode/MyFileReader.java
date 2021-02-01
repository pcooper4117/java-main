package com.techelevator.myFileReadingCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
		// 	THROWS tells the compiler you know code might throw and exception
	public static void main(String[] args) throws FileNotFoundException {
	// read data from a file
		// display the line read from file
		// sum the numbers
		// average the number
		// print the sum and average
		//
		//instantiate a file object for the file containing the data
		int sum = 0;
		double average = 0;
		
		File theFile = new File("./data/numbers.txt");
		Scanner fileReader = new Scanner(theFile);
		// loop through the array one at a time
		while(fileReader.hasNext()) { 			// as long as the file has next line to read we wil get it
			String aLine = fileReader.nextLine();
			System.out.println("The line read: " + aLine);
			String[] theNumbers = aLine.split(",");
			sum = 0;
			for (int i=0; i <theNumbers.length; i++) {
				int aNumber = Integer.parseInt (theNumbers[i].trim());// convert current element into int
				sum += aNumber;	
				
			}
			average = (double) sum / theNumbers.length;// add the number to the sum
			
			System.out.println("Sum " + sum + " avg " + average);
			
			
		}
		fileReader.close();
}
}
