package com.techelevator;

public class FranksArrayExample {
	
	public static void main(String[] args) {  
		
		System.out.println("Welcome to Frank's Array Example Program"); 
	/	int score1 = 10;
			int score2 = 20;
			int score3 = 30;
				int score4 = 50;
			int score5 = 90;
			
			int sum = 0; // this will hold sum of scores
			double avg = 0.0; // this will hold averege of scores
					
					
				sum = score1 + score2 + score3 + score4 + score5; // a change in data require a change in code
		avg = sum / 5 ;
			
			
			System.out.println ("Sum of scores: " + sum);
			System.out.println ("averege of scores: " + avg);

		
		//
			// Use an array to make the code loosely coupled
			// loosley coupled code means code is not directly bound to data
			// changes to data does not require change to code - sign of professional programmer
			// 		for (int i=0; i <scores.length; i++)
			//		i will be set to 0
			//		check to see if i is less than the number of elements in scores array (i<3) - i=0,1,2 we loop; i = 3 we exit loop
			//		execute statement in block
			//		increment i
			//		go back to step 2
			//		
			
			int[] scores = new int[5];
			scores [0] = 10;
			scores [1] = 20;
			scores[2] = 30;
			scores[3]  = 80;
			scores [4] = 120;
			sum = 0;
			for(int i = 0;  i < scores.length; i++) {
				sum = sum + scores[i]; // add element in scores[i] to sum; scores[i] is current element;
			
	}   
   //			at the end of loop sum will contain total of all elements
			avg = sum / scores.length; 
			
			System.out.println ("Sum of scores: " + sum);
			System.out.println ("averege of scores: " + avg);
	}
}