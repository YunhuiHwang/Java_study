package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_8 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);

		double[][] score = new double[4][2];
		double best = 0;
		int grade = 0, semester = 0;

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				System.out.print((i + 1) + "학년 " + (j + 1) + "학기는?");
				score[i][j] = scn.nextDouble();
				if (score[i][j] > best) {
					best = score[i][j];
					grade = (i + 1);
					semester = (j + 1);
				}

			}
		}

		System.out.print("결과: " + grade + "학년 " + semester + "학기 " + best);
	}

}
