package io.mulshankar13.datastructures.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
	public static void main(String[] args) {
		
			int nums [] = {4,1,2,1,2,2};// {2,2,1};
			System.out.println( 10%10);
			//int n  = singleNumber(nums);
			//System.out.println(n);
	}
	
	public static int singleNumber(int[] nums) {
		int b=0;
        for(int i:nums)
        {
        	System.out.println("Before: i="+i + " b="+b);
            //a^=i;
            b=b^i;
            System.out.println("After: b="+b + " b^=1 ="+b);
        }
        return b;
	}
	
	/*
	 * public static int singleNumber(int[] nums) {
	 * 
	 * Map<Integer, Integer> freq = new HashMap<Integer, Integer>(); for (int i :
	 * nums) { if(freq.containsKey(i)) { freq.put(i, freq.get(i)+1); } else {
	 * freq.put(i, 1); }
	 * 
	 * }
	 * 
	 * for (Map.Entry<Integer, Integer> entrySet : freq.entrySet()){ if
	 * (entrySet.getValue()==1) { return entrySet.getValue(); } } return 0; }
	 */
}
