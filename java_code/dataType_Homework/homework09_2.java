package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework09_2 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);

		int[][] array = new int[5][5];

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				array[i][j] = (int) (Math.random() * 9 + 1);
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("숫자를 입력하시오: ");
		int num = scn.nextInt();

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (array[i][j] < num)
					System.out.print('X');
				else
					System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}

}
