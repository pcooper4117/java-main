package com.techelevator.Bowling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class League {
private String leagueName;
private Map<Integer, ArrayList<Bowlers> leagueMembers;

public League() {
	leagueName 	  = null;
	leagueMembers = null;
}

public League(String leagueName, String dataFileName) throws FileNotFoundException {
	this.leagueName = leagueName;
	// load the data from the file given into LeagueMembes
	loadFile(dataFileName); 
}

private void loadFile(String fileName) throws FileNotFoundException {
	File aFile = new File (fileName);
	Scanner inputDataFile = new Scanner(aFile);
	int teamNumber = 0;
	int bowlerNumber = 0;
	String bowlerName = null;
	ArrayList<Integer> scores = new ArrayList<Integer>();
	while(inputDataFile.hasNext() ) {
		String aLine = inputDataFile.nextLine();
		String[]  valuesInLine = aLine.split(",");
	// define variables needed to instantiate bowler	
		 teamNumber = Integer.parseInt(valuesInLine[0]);
		 bowlerNumber =  Integer.parseInt(valuesInLine[1]);
		bowlerName = valuesInLine[2];
		
		scores.add(Integer.parseInt(valuesInLine[3]));
		scores.add(Integer.parseInt(valuesInLine[4]));
		scores.add(Integer.parseInt(valuesInLine[5]));
		Bowler aBowler = new Bowler(teamNumber, bowlerNumber, bowlerName, scores);
		}
	}
}
