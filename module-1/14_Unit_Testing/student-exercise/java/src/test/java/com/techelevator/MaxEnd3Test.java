package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxEnd3Test {
	MaxEnd3 testCode = new MaxEnd3();
public void larger_first_or_last() {
	int [] nums = new int[] {1,2,3};
	int [] nums2 = new int[] {11,5,9};
	int [] nums3 = new int[] {2,11,3};
	int [] R1 = new int[] {3,3,3};
	int [] R2 = new int[] {11,11,11};
	int [] R3 = new int[] {3,3,3};

assertArrayEquals("Returns Array 3,3,3,", R1, testCode.makeArray(nums));
assertArrayEquals("Returns Array 11,11,11", R2, testCode.makeArray(nums2));
assertArrayEquals("Returns Array 3,3,3,", R2, testCode.makeArray(nums3));

}
	

}
		//MakeArray([1, 2, 3]) → [3, 3, 3]
	   //  MakeArray([11, 5, 9]) → [11, 11, 11]
	   //  MakeArray([2, 11, 3]) → [3, 3, 3]