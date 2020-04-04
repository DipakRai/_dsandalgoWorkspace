package mulshankar13.leetcode;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String roman = intToRoman(scan.nextInt());
//		System.out.println(roman);
//		scan.close();
		int num = 3999;
		System.out.println(num%1000);
		System.out.println((num%1000)/100);
	}

	public static String intToRoman(int num) {

		String[] units = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] hundreds = { "", "C", "CC", "CCCC", "CD", "D", "DD", "DDD", "DDDD", "DM" };
		String[] thousands = { "", "M", "MM", "MMM" };
		return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[num % 10];
	}
}