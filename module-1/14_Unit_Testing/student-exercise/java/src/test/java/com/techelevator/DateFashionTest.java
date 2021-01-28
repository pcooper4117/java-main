package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {

	DateFashion testcode = new DateFashion ();
			
@Test

public void test_if_we_get_a_table() {
	assertEquals("Should be Yes ",2,testcode.getATable(5, 10));
	assertEquals("Should be No",0,testcode.getATable(5, 2));
	assertEquals("Should be Maybe",1, testcode.getATable(5, 5));
}

}
