package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {

		int[] stones = { 2, 7, 4, 1, 8, 1 };
		int weight = lastStoneWeight(stones);
		System.out.println("weight:" + weight);
	}

	public static int lastStoneWeight(int[] stones) {

		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for (Integer integer : stones) {
			pQueue.add(integer);
		}
		while (pQueue.size()>1) {
			int i1 = pQueue.poll();
			int i2 = pQueue.poll();
			if (i1!=i2) pQueue.add(Math.abs(i1-i2));
		}
		return pQueue.isEmpty()?0:pQueue.poll();
	
	}
}
