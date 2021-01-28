package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimalGroupName {
// first we need to define an object with the methods we want to test
	
	
	AnimalGroupName testCode = new  AnimalGroupName (); // object with methods we want to test
	
@Test	
	public void test_correct_animal_group_name_returned_based_on_animal  () {
	// methods in the class that we are testing are:
	//
	//String getHerd(String animalName)
	//
	// the method returns a string - assertEquals
	
	// test 1 send  "Elephant" and expect "herd"
	// test 2 Walrus expect unknown
	// test 3 sent it "elephant" expect "Herd"
		assertEquals("Wrong animal group returned", "Herd", testCode.getHerd("Elephant"));
		assertEquals("Wrong animal group returned", "unknown", testCode.getHerd("Walrus"));
		assertEquals("Wrong animal group returned", "Herd", testCode.getHerd("elephant"));

}
	

}
