package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {
Lucky13 testCode = new Lucky13();
public void test_if_array_contains_no_ones_or_twos() {
	int[] nums = new int[] {0,2,4};
	int[] nums1 = new int[] {1,2,3};
	int[] nums2 = new int[] {1,2,4};

	assertTrue("Error message", testCode.getLucky(nums));
	assertTrue("Error message", testCode.getLucky(nums1));
	assertTrue("Error message", testCode.getLucky(nums));

}

}
/*
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
 * 4]) → false
 */