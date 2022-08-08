package org.java_code.practice_midterm;

import java.util.Scanner;

public class P12_Switch {
	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		String fruit= scn.next();

		switch (fruit) {
		case "»ç°ú" :
			System.out.println("¸À³ª");
			break;
		case "µþ±â":
			System.out.println("¸À³ª");
			break;
		case "±Ö":
			System.out.println("º¸Åë");
			break;
		case "¿À·»Áö":
			System.out.println("º¸Åë");
			break;
		default:
			System.out.println("º°·Î");
		}

	}
}
