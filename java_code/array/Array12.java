package org.java_code.array;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[][] score = new int[3][3];

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				score[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}

}
