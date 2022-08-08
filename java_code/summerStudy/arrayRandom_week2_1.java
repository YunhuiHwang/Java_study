package org.java_code.summerStudy;

import java.util.Arrays;

public class arrayRandom_week2_1 {

	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 10; i++) {
			int temp;
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);
			temp = numArr[a];
			numArr[a] = numArr[b];
			numArr[b] = temp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}