package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework09_3 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);

		double[][] score = new double[4][2];

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 2; ++j) {
				score[i][j] = scn.nextDouble();
			}
		}
		System.out.print("�г��� �Է��Ͻÿ�: ");
		int grade = scn.nextInt();

		System.out.println(grade +"�г� 1�б�: "+ score[(grade-1)][0]);
		System.out.println(grade +"�г� 2�б�: "+ score[(grade-1)][1]);
		}

	}


