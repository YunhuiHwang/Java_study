package org.java_code.summerStudy;

import java.util.Scanner;

public class multiplication_2588 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		String b = scn.next();
		
		for (int i = 2; i >= 0; i--) {
			System.out.println(a * Character.getNumericValue(b.charAt(i)));
		}
		System.out.println(a * Integer.parseInt(b));
	}
}
