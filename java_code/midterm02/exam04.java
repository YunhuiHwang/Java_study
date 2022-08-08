package org.java_code.midterm02;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		System.out.println("4번 60201393 황윤희");

		Scanner scn = new Scanner(System.in);

		double[][] score = new double[4][2];
		double avg = 0;
		int grade = 0;

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				System.out.print((i + 1) + "학년 " + (j + 1) + "학기는?");
				score[i][j] = scn.nextDouble();

			}
		}
		
		for (int i = 0; i < 4; ++i) {
			avg=(double)(score[i][0]+score[i][1])/2;
			System.out.println((i + 1) + "학년 " + avg);
			avg=0;
		}
	}

}
