package com.techelevator.PatricksStockProject;

import java.util.Scanner;

public class Menu {
	private Scanner Scanner;
	public int choice;
	
	
	public void MenuOption() {
		 Scanner = new Scanner(System.in);
	 }
	 
	 public void PrintMainMenu() {
		
		 System.out.println("");
		 System.out.println("Welcome to Patrick's stock decision application! ");
		 System.out.println("\n At the end of this program you should hava clear understanding if a particular stock is buy, a sell, or a hold.");
		 System.out.println(" To start we will need to decide what type of trade this is");
		 System.out.println(" Will you be day trading on the one minute chart or swing trading on the one hour chart?");
		 System.out.println("Please choose a selection");
		 System.out.println("\n 1 : Day Trading");
		 System.out.println("2 : Swing Trading");
		 System.out.println("3 : Exit Program");
		 choice = Scanner.nextInt();
		 
		 switch(choice) {
		 case 1: dayTrade();
		 break;
		 
		 case 2: swingTrade();
		 break;
		 
		 case 3: 
		 }
			 
		 }


		
	}

	
		
	
		
	 
