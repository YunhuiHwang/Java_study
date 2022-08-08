package org.java_code.sort;

public class sort01 {
	public static void main(String[] args) {
		int[] arr = { 43, 16, 13, 8, 32, 10 };

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				/*
				 for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}System.out.println(); 하면 바뀌는 과정도 볼 수 있다.
				 */
			}

		}
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

}
