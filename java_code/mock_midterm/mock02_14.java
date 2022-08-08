package org.java_code.mock_midterm;

import java.util.Scanner;
import java.util.Arrays;

public class mock02_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] a = new int[4];
		int[] b = new int[4];

		System.out.println("첫번째 배열의 원소를 입력하시오.");
		for (int i = 0; i < a.length; ++i) {
			a[i] = scn.nextInt();
		}

		System.out.println("두번째 배열의 원소를 입력하시오.");
		for (int i = 0; i < b.length; ++i) {
			b[i] = scn.nextInt();
		}

		merge(a, b);
	}

	public static void merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; ++i) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; ++i) {
			c[i + a.length] = b[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < c.length; ++i) {
			System.out.print(c[i] + " ");
		}
	}

}
