package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [
		 * ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
		 */
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(input));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		// prepare a map with word as key and ascii total as value
		// if two keys have the same value create a new list for them
		Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();
		for (String string : strs) {
			char[] characters = string.toCharArray();
			Arrays.sort(characters);
			if (!anagramMap.containsKey(String.valueOf(characters))) {
				List<String> wordList = new ArrayList<String>();
				wordList.add(string);
				anagramMap.put(String.valueOf(characters), wordList);
			} else {
				anagramMap.get(String.valueOf(characters)).add(string);
			}
		}
		return new ArrayList<List<String>>(anagramMap.values());
	}

}
