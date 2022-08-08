package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_6 {
	public static int fac(int a) {
		int mul=1;
		for (int i=1; i<=a; ++i) {
			mul=mul*i;
		}
		return mul;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		System.out.println(n+"!은 "+ fac(n)+"입니다.");
		
	}

}
