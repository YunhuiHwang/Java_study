package org.java_code.summerStudy;

import java.util.Scanner;

public class goblin_9226 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		
		while (true) {
			String word = scn.next();
			boolean a = false;

			if (word.equals("#")) {
				break;
			}

			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < vowels.length; j++) {
					if (a)
						break;
					else if (word.charAt(i) == vowels[j]) {
						word = word.substring(i) + word.substring(0, i);
						System.out.println(word + "ay");
						a = true;
					}
				}
			}
		}
	}
}