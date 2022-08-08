package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_12_2 {
	public static void main(String[] args) {
		System.out.println("60201393 황윤희");

		int[][] arr = new int[3][3];
		System.out.println("최대값은 " + find_max(arr));

	}

	public static int find_max(int[][] score) {
		Scanner scn = new Scanner(System.in);
		int max = 0;

		for (int i = 0; i<score.length; ++i) {
			System.out.println((i+1) + "번째 학생의 점수는?");
			for (int j = 0; j < score[i].length; ++j) {
				score[i][j] = scn.nextInt();
				if (score[i][j] > max)
					max = score[i][j];
			}
		}
		return max;
	}

}
