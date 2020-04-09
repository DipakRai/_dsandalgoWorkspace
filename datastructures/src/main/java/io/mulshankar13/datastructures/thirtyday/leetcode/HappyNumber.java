package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {

		System.out.println(isHappy(3));
		// System.out.println(1/10);
	}

	public static boolean isHappy(int n) {
		// declare a set of visited numbers
		// if any of the new number is contained in the set : return false
		// else if the new number is 1: return true
		Set<Integer> visited = new HashSet<Integer>();
		int sum = 0;
		while (!visited.contains(n)) {
			visited.add(n);
			sum = 0;
			while (n > 0) { // as long as the number is not 0
				// add the remainder after raising it to the power of 2
				sum += Math.pow(n % 10, 2);
				n = n / 10;
			} // end of sum calculation loop
			if (sum == 1) {
				return true;
			}if (sum == 1) {
				return true;
			}
			n = sum; // reset n to new sum
		} // end of all new numbers
		return false;

	}

}
