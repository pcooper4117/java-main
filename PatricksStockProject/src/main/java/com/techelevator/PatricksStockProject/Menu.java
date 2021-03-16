package com.techelevator.PatricksStockProject;

import java.util.ArrayList;
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
		 
		
		 }
			 
		 }

	private void dayTrade() {
	
		
	}

	private void swingTrade() {
		ArrayList<Integer> Nums =new ArrayList<Integer>();
		 System.out.println("");
		 System.out.println("Swing Trade Buy Sell or Hold!");
		 System.out.println("\n We will need to know a few things before we begin.");
		 System.out.println(" Start by selecting the one hour chart on your trading platform with all indicators displayed");
		 System.out.println(" Is the stock price two green candle sticks above the Moving Average?");
		 System.out.print("True");
		 System.out.print("False");
		 choice = Scanner.nextInt();
		 if (true) {
			 Nums.add(1);
		 } 
		 else {
			 Nums.add(0);
		 }
		 System.out.print("Is the Volume over 1 million? ");
		 choice = Scanner.nextInt();
		 if (true) {
			 Nums.add(1);
		 } 
		 else {
			 Nums.add(0);
		 }
		 System.out.print("Is the RSI over 45? ");
		 choice = Scanner.nextInt();
		 if (true) {
			 Nums.add(1);
		 } 
		 else {
			 Nums.add(0);
		 }
		 System.out.print("Is there a positive crossover on the MACD? ");
		 choice = Scanner.nextInt();
		 if (true) {
			 Nums.add(1);
		 } 
		 else {
			 Nums.add(0);
		 }
	}
		


		
	}

	
		
	
		
	 
