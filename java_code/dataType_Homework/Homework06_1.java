package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework06_1 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);

		String[] subject = { "����", "����", "����" };
		String[] name = new String[4];
		double[][] score = new double[4][5];

		for (int i = 0; i < 4; ++i) {
			System.out.println("�̸��� ������ �Է��Ͻÿ�");
			System.out.print("�̸�: ");
			name[i] = scn.next();
			for (int j = 0; j < 3; ++j) {
				System.out.print(subject[j] + " : ");
				score[i][j] = scn.nextInt();
				score[i][3] += score[i][j];
				score[i][4] += score[i][j] / 3;
			}

		}
		System.out.println("             Kor  Eng  Mat  Tot   Avg");
		System.out.println("=======================");
		for (int i = 0; i < 4; ++i) {
			System.out.print(name[i] + "   ");
			for (int j = 0; j < 4; ++j) {
				System.out.print((int) score[i][j] + "     ");
			}
			System.out.println(Math.round(score[i][4] * 10) / 10.0);
		}
	}

}
