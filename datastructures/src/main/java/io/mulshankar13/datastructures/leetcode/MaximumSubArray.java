package io.mulshankar13.datastructures.leetcode;

/**
 * Leetcode 30 days challenge
 * 
 * @author mulshankar13
 *
 */
public class MaximumSubArray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}
	

	public static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum=0;
		for (int i=0;i<nums.length;i++) {
			sum+=nums[i];
			max=Math.max(sum, max);
			if(sum<0) { // reset the sum as we need max value and in case of all -ve numbers max has to be -1 and +ve/-ve numbers combination it has to be 0
				sum=0;
			}
		}
		return max;
	}

}
