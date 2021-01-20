package com.techelevator;

import java.util.HashMap; // include code to support a hash map
import java.util.LinkedHashMap;
import java.util.Map; // include code to support a generic map
import java.util.Set; //   include the code to support a set
import java.util.TreeMap;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
//  map is a collection class to hold and access key value pairs
		// key is a unique value that identifies the pair
		// the value is what you want associated with the key
		// map is also known as an "associative array"
		// 
		//a key must be unique within the map
		//
		//Types of maps:
		// 		HashMap -  entries are stored in an unknown order
		//		TreeMap  - entries are stored in key sequence 
		//		LinkedHashMap - entries are stored in order they are added to map
		//
		// To define a Map 
		//			Map<key-data-type, value-data-type> name-of-map =  type-of-map ()
		//			type-of -map<key-data-type, value-data-type> name-of-map = type-of-map()
		//
		//			Map<String,String> myMap = newHashMap();
		//			HashMap<String,String> myMap = newHashMap();
		//			Map<String,String> myMap = newHashMap<String, String>();
		//			HashMap<String,String> myMap = newHashMap<String, String>();
//
		// define a map to associeate a persons name to where they live = ex. "Frank" - "Mayfeild"
		// key is persons name   - string
		// value is where they live   -string
		
		// key type, value type  name		type of map
		Map<String, String> residence = new LinkedHashMap();
		
		residence.put("Frank", "MayField");
		residence.put("Jeff", "Istanbul");
		residence.put("Bri", "MayField");
		residence.put("Frank", "North Tonawanda");
		residence.put("D", "Wakanda");
		residence.put("Sam", "Youngstown");
		residence.put("Avery", "Cleveland Heights");
		residence.put("Dan", "Lakewood");
		residence.put("Wally", "Mayfield");
		// use .get(Key,Value) to access map using a key the value thats associated with key is whats returned;
		//
		System.out.println("D lives in " + residence.get("D"));
		System.out.println("Bri lives in " + residence.get("Bri"));
		System.out.println("Jeff lives in " + residence.get("Jeff"));
	String name = "Sam";
		System.out.println(name + " lives in :" + residence.get(name));
		
		System.out.println("-----------------------------------------------------------------------------------");

		// to process all the entries in a map you need to get a list of keys in the map and use the process the entries of map
		// we need to get a list of keys out of the map and then iterate through that list keys using some form of for loop
		// .keySet() reutrns the list of keys in a map as a set object
		
	//  a set object is a instance of the collection class set
		//
		// a set class is an unordered set of elements that must be unique.
		// (different from arrayList becuase elements in array list dont have to be unique.)
		//
		// to define a set: Set<data-type>
		 // get the list of keys in our map
					Set<String> theKeys =  residence.keySet(); // get the keys from resiedence from set. string because keys are strings
					
					
					// go through the set of keys using For-each loop since we want to process all the keys
				for(String anElement : theKeys) {  // loop through the keys one at a time assigning the current key to element
					String theValue = residence.get(anElement);  //get vaule of current key and store it in value
					System.out.println(anElement + " lives in " + theValue);
				}
				System.out.println("-----------------------------------------------------------------------");

		residence.remove("Frank");
		System.out.println("Frank lives in " + residence.get("Frank"));
		System.out.println("Try to add Daniel living Timbuktu");
		residence.put("Daniel", "Timbuktu");
		System.out.println("Daniel lives in " + residence.get("Daniel"));

		for(String anElement : theKeys) {  // loop through the keys one at a time assigning the current key to element
			String theValue = residence.get(anElement);  //get vaule of current key and store it in value
			System.out.println(anElement + " lives in " + theValue);
		
	}

	}
	}
	
