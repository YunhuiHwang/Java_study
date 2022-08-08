package org.java_code.midterm02;

import java.util.Arrays;

public class exam03 {

	public static void ascending_order(int a[]) {
		Arrays.sort(a);
		for (int i = 0; i < 5; ++i) {
			System.out.print
			(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("3¹ø 60201393 È²À±Èñ");
		int[] arr = { 3, 6, 2, 8, 1 };
		ascending_order(arr);
	}

}
