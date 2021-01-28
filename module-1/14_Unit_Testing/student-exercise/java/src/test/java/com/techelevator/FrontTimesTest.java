package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {
FrontTimes testCode = new FrontTimes ();
	@Test
public void did_we_return_copies() {
		assertEquals("You returned the wrong value", "ChoCho",testCode.generateString("Chocolate", 2));
		assertEquals("You returned the wrong value", "ChoChoCho",testCode.generateString("Chocolate",3 ));
		assertEquals("You returned the wrong value", "AbcAbcAbc",testCode.generateString("Abc", 3));

	}
	

}
