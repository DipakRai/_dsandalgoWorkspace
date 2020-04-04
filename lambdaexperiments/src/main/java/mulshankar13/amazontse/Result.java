package mulshankar13.amazontse;

import java.lang.reflect.Array;

class Result {

	/*
	 * Complete the 'zeros' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts INTEGER n
	 * as parameter.
	 */
	public static void main(String[] args) {
		int n = 23;
		Bigfactorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("factorial="+factorial);
		String temp = Double.toString(factorial);
		System.out.println("tmp"+temp);
		char[] ch = new char[temp.length()];

		// Copy character by character into array
		for (int i = 0; i < temp.length(); i++) {
			ch[i] = temp.charAt(i);
		}
		int counter = 0;
		System.out.println(ch);
		for (int j = ch.length-1; j >= 0; j--) {
			if (ch[j] == '0') {
				counter++;
			} else if (ch[j] != '0') {
				break;
			}
		}
		System.out.println(counter);
	}
}
