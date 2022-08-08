package org.java_code.sort;

import java.util.Arrays;

public class sort02 {

	public static void main(String[] args) {
		int[] arr = { 43, 16, 13, 8, 32, 10 };

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

}
