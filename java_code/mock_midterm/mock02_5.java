package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[][] arr = new int[5][5];

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				arr[i][j] = (int) (Math.random() * 2);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("0�� 1�� �Է��Ͻÿ�.");
		int n = scn.nextInt();

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (arr[i][j] == n)
					System.out.print(arr[i][j] + " ");
				else
					System.out.print("  ");
			}System.out.println();
		}

	}

}
