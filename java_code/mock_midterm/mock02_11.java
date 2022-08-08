package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_11 {
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}

	public static double avg(int a, int b, int c) {
		return (double) (a+b+c) / 3;
	}

	public static void main(String[] args) {
		System.out.println("60201393 »≤¿±»Ò");
		Scanner scn = new Scanner(System.in);
		int a = 0, b = 0, c = 0;

		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		System.out.println("√—«’¿∫ " + sum(a, b, c));
		System.out.println("∆Ú±’¿∫ " + avg(a, b, c));

	}
	

}
