package org.java_code.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		String[] subject = { "����", "����", "����", "����" };
		int[] score = { 100, 80, 90, 95 };

		Scanner scn = new Scanner(System.in);
		String name;

		while (true) {
			System.out.println("������� �Է��ϼ���.");
			name = scn.next();

			for (int i = 0; i < subject.length; ++i) {
				if (subject[i].equals(name))
					System.out.println(subject[i] + "�� ������" + score[i] + "�Դϴ�.");

			}
			if (name.equals("�׸�"))
				break;
		}

	}

}
