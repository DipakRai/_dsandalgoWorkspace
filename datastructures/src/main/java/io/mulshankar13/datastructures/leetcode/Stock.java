package io.mulshankar13.datastructures.leetcode;

public class Stock {

	public static void main(String[] args) {
		// [7,6,4,3,1],[1,2,3,4,5],[7,1,5,3,6,4]
		int[] input = { 1, 2, 3, 4, 5 };// {7,6,4,3,1};
		System.out.println(maxProfit(input));

	}

	private static int maxProfit(int[] prices) {
		int maxProfit = 0;
		for (int i = 0; i < prices.length-1; i++) {
			if (prices[i] > prices[i + 1]) { // compare the price of nth day to n+1th day
				continue;				
			} else {
				maxProfit += prices[i + 1] - prices[i];
			}
		}
		return maxProfit;
	}
}
