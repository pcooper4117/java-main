package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

// arrayList is type of list that acts similar to an array
		// arrayList has elements that are stored in order in which they are added to array
		//two ways to define new arrayLists: 
		//		arrayList<data-type-it-holds> name = new arrayList();
		// 		List<data-type-it-holds> name =  new arraryList;
		//  define a new arrayList to hold strings representing peoples names
		
		ArrayList<String> names = new ArrayList();
		// .add() method is used to add elements to arrayList
		names.add("Jason");
		names.add("Sam");
		names.add("Avery");
		names.add("Daniel");
		names.add("D");
		names.add("Joel");
		names.add("Frank");
		System.out.println("Our ArrayList contains " + names.size() + " elements");
		
		System.out.println("####################");
		System.out.println("Lists are ordered in the order they are entered");
		System.out.println("####################");

for (int i= 0; i < names.size(); i ++){
	System.out.println ("Element #" + i + ": " + names.get(i));
}
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
names.add("Avery");
for (int i= 0; i < names.size(); i ++){
	System.out.println ("Element #" + i + ": " + names.get(i));
}
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
// .add(index, object) index is the object you want to be inserted;
		names.add(3, "Anne");
		
		for (int i= 0; i < names.size(); i ++){
			System.out.println ("Element #" + i + ": " + names.get(i));
		}
		

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

names.remove(0);
for (int i= 0; i < names.size(); i ++){
	System.out.println ("Element #" + i + ": " + names.get(i));
}
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		System.out.println( "Is Joel in the list?" + names.contains("Joel"));
		System.out.println( "Is Joel in the list?" + names.contains("Frank"));
		if (names.contains("Anne")) {;
		System.out.println("Anne is in our list");
		}
		else { 
			System.out.println("Anne is not on the list");
		
		}
		

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

System.out.println( "the first time Avery appears in the list is index " + names.indexOf("Avery"));
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

String[] namesArray = names.toArray(new String[0]);
for (int i= 0; i < namesArray.length; i ++){
	System.out.println ("Element #" + i + ": " + namesArray[i]);
}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

	Collections.sort(names);
	for (int i= 0; i < names.size(); i ++){
		System.out.println ("Element #" + i + ": " + names.get(i));
	}
	
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
// format of for-each loop for(datatype elem-name : array/Arraylist-name)
		// each time through the loop of the element is assigned the current element
		// use a for each loop to display all of the elements in the array list
		
		for (String aName : names) {
System.out.println("Current element is: " + aName);
	}
}
}
