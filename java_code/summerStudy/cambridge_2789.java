package org.java_code.summerStudy;

import java.util.Scanner;

public class cambridge_2789 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word = scn.next();
		char[] original = word.toCharArray();

		for (int i = 0; i < original.length; i++) {
			switch (original[i]) {
			case 'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E':
				break;
			default:
				System.out.print(original[i]);
			}
		}
		//.replaceAll("[CAMBRIDGE]","")
		//.replace 왜 안 되는지 다시 확인해보기
	}
}