package io.mulshankar13.datastructures.contests;

import java.util.StringTokenizer;

public class EntityParsing {

	public static void main(String[] args) {
		String text = "and I quote: &quot;...&quot;";
		System.out.println(entityParser(text).toString());
	}

	public static String entityParser(String text) {

		StringTokenizer tokenizer = new StringTokenizer(text, " ;&");
		String [] stringArray = new String [tokenizer.countTokens()];
		int count=0;
		String token = null;
		while (tokenizer.hasMoreTokens()) {
			
			token = tokenizer.nextToken();
			System.out.println("token "+token);
			switch (token) {

			case "&quot;": {
				stringArray[count]="\"";
			}
			case "&apos;": {
				stringArray[count]="\"";
			}
			case "&gt;": {
				stringArray[count]="\"";
			}
			case "&lt;": {
				stringArray[count]="\"";
			}
			case "&frasl;": {
				stringArray[count]="\"";
			}
			default : {
				stringArray[count]=token;
			}
			}
			count++;
		}
		for (String string : stringArray) {
			System.out.println(" string :"+string);
		}
		return String.valueOf(stringArray);
	}

}
