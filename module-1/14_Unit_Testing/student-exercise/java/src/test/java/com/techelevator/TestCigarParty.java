package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCigarParty {
	
	CigarParty testCode  = new CigarParty();
	
	@Test
public void  return_true_if_party(){
		assertFalse("The intput is false",testCode.haveParty(30,false));
		assertTrue("The intput is false",testCode.haveParty(50,false));
		assertTrue("The intput is true", testCode.haveParty(70,true));

	}


}
