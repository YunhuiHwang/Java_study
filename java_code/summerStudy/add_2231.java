package org.java_code.summerStudy;

import java.util.Scanner;

public class add_2231 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();

		for (int i = 0; i < N; i++) {
			int num = i, sum = 0;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (i + sum == N) {
				System.out.println(i);
				break;
			}
		}
	}
}