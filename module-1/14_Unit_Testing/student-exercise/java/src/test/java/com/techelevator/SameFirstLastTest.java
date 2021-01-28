package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SameFirstLastTest {
SameFirstLast testCode = new SameFirstLast();
public void return_true_if_the_array_is_length_1_or_more() {
int[] nums = new int[] {1,2,3};
int[] nums2 = new int[] {1,2,3,1};
int[] nums3 = new int[] {1,2,1};

	
	assertFalse("Expected false", testCode.isItTheSame(nums));
	assertTrue("Expected true", testCode.isItTheSame(nums2));
	assertTrue("Expected true", testCode.isItTheSame(nums3));

}

}
/*
Given an array of ints, return true if the array is length 1 or more, and the first element and
the last element are equal.
IsItTheSame([1, 2, 3]) → false
IsItTheSame([1, 2, 3, 1]) → true
IsItTheSame([1, 2, 1]) → true
*/