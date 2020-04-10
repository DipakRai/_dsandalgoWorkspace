package io.mulshankar13.datastructures.thirtyday.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BackspaceCompare {

	public static void main(String[] args) {
		// S = "ab#c", T = "ad#c"
		// S = "ab##", T = "c#d#"
		// S = "a##c", T = "#a#c"
		// S = "a#c", T = "b"
		// String S = "a#c", T = "b";
		String S = "ab##"; //"a##c";// //"ab#c";
		String T = "ad#c"; //"#a#c";// ;
		System.out.println(backspaceCompare(S, T));
	}
	
	public static boolean backspaceCompare(String S,String T) {
		return buildStack(S).equals(buildStack(T));
	}
	
	public static String buildStack(String S) {
		Stack<Character> stack = new Stack<Character>();
		for (Character character : S.toCharArray()) {
			if(!character.equals('#')) {
				stack.push(character);
			} else if(!stack.isEmpty()){
				stack.pop();
			}
		}
		return String.valueOf(stack);
	}

	/**
	 * approach 1
	 * @param S
	 * @param T
	 * @return
	 */
	public static boolean backspaceCompare1(String S, String T) {
		char[] schar = S.toCharArray();
		char[] tchar = T.toCharArray();

		int i = compareString1(schar).compareTo(compareString1(tchar));
		System.out.println(" i :" + i);
		if (i == 0) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * approach 1
	 * @param schar
	 * @return
	 */
	public static String compareString1(char[] schar) {
		int count = 0;
		for (int i = 0; i < schar.length; i++) {
			if (schar[i] != '#') {
				schar[count++] = schar[i]; // a
			} else if (count > 0) {
				count--;
			}
		}
		return new String(schar, 0, count);
	}

}
