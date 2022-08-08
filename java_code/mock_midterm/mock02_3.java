package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_3 {

	public static void print_ascii(char ch1, char ch2) {
		System.out.print((int) ch1+" "+ (int) ch2);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		char a = scn.next().charAt(0);
		char b = scn.next().charAt(0);

		print_ascii(a, b);

	}

}
