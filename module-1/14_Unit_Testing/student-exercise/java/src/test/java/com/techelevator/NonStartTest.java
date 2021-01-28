package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class NonStartTest {
NonStart testCode = new NonStart();
public void test_if_returned_concatenation() {
	assertEquals ("You gave wrong String", "ellohere", testCode.getPartialString("Hello", "There"));
	assertEquals ("You gave wrong String", "avaode", testCode.getPartialString("java", "code"));
	assertEquals ("You gave wrong String", "hotlava", testCode.getPartialString("shotl", "java"));

}



}
/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will
be at least length 1.
GetPartialString("Hello", "There") → "ellohere"
GetPartialString("java", "code") → "avaode"
GetPartialString("shotl", "java") → "hotlava"
*/