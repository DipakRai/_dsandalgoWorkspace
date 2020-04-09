package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 30 days leetcode challenge
 * 
 * @author mulshankar13
 *
 */
public class MoveZeroes {

	// Input: [0,1,0,3,12]
	// Output: [1,3,12,0,0]

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12 };
		trailingZeroes(a);
	}

	private static void trailingZeroes2(int[] a) {
		// counter for zeroes in array
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
	}
	private static void trailingZeroes(int[] a) {
		int count = 0;
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) { // check for the element being 0
				intList.add(a[i]);
			} else {
				count++; // pointer for the number of zeroes to be added
			}
		}
		while (count != 0) {
			count--;
			intList.add(0);
		}
		System.out.println(intList);
	}
}
