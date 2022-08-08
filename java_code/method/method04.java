package org.java_code.method;

import java.util.Arrays;
import java.util.Scanner;

public class method04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[3];

		for (int i = 0; i < num.length; ++i) {
			num[i] = scn.nextInt();
		}

		sort(num);
	}

	public static void sort(int[] num) {
		Arrays.sort(num);
		for (int i = 0; i < num.length; ++i) {
			System.out.print(" " + num[i]);
		}

	}

}
