package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

	public static void main(String[] args) {
		// [1,1,2,2], [1,3,2,3,5,0],[1,1,3,3,5,5,7,7]
		int[] arr = {1,1,3,3,5,5,7,7 };
		System.out.println(countElements(arr));
	}

	public static int countElements(int[] arr) {

		// 1,2:set
		/*
		 * loop through array:1,1,2,2 for set element: element ==arr[i]+1 yes: count++;
		 * 
		 */
		Set<Integer> elemSet = new HashSet<Integer>();
		for (Integer integer : arr) {
			elemSet.add(integer);
		}
		int count = 0;
		for (Integer integer : elemSet) {
			for (Integer integer2 : arr) {
				if (integer == integer2 + 1) {
					count++;
				}
			}
		}
		return count;
	}

}
