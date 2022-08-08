package org.java_code.summerStudy;

import java.util.Scanner;

public class upperLower_2744 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word = scn.next();
		char[] arr = word.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(arr[i]))
				arr[i] += 32;
			else 
				arr[i] -= 32;
		}
		System.out.println(arr);
	}
}