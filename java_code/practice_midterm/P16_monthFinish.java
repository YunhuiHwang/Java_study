package org.java_code.practice_midterm;

import java.util.Scanner;

public class P16_monthFinish {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);

		int month = scn.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 4, 6, 9, 11:
			System.out.println("30");
			break;
		default:
			System.out.println("Àß¸øµÈ °ª");
			break;
		}

	}

}
