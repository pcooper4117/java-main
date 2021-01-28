package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Less20Test {
Less20 testCode = new Less20();
@Test
public void if_one_or_two_less_than_mulitple_of_20() {
	assertTrue("ecpected True", testCode.isLessThanMultipleOf20(18));
	assertTrue("ecpected True", testCode.isLessThanMultipleOf20(19));
	assertFalse("ecpected False", testCode.isLessThanMultipleOf20(20));

	
}
	

}
//less20(18) → true
//less20(19) → true
//less20(20) → false