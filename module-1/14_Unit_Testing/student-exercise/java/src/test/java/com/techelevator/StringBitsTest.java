package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {
StringBits testCode = new StringBits();
public void every_other_char() {
	assertEquals ("You gave the wrong String", "Hlo",testCode.getBits("Hello"));
	assertEquals ("You gave the wrong String", "H",testCode.getBits("Hi"));
	assertEquals ("You gave the wrong String", "Hello",testCode.getBits("Heeololeo"));

}


}
/*
 * Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
 * → "H" GetBits("Heeololeo") → "Hello"
 */