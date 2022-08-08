package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework09_3 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);

		double[][] score = new double[4][2];

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				score[i][j] = scn.nextDouble();
			}
		}
		System.out.print("학년을 입력하시오: ");
		int grade = scn.nextInt();

		System.out.println(grade +"학년 1학기: "+ score[(grade-1)][0]);
		System.out.println(grade +"학년 2학기: "+ score[(grade-1)][1]);
		}

	}


