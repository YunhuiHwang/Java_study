package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework05_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		System.out.println("������)");
		int i = scn.nextInt();
		String a = " ";
		String b = " ";
		if (i == 1)
			a = "�Ҽ��� �ƴմϴ�.";
		for (int j = 2; j < i; ++j) {
			if (i % j == 0)
				a = " �Ҽ��� �ƴմϴ�.";
			else
				a = " �Ҽ��Դϴ�.";

		}
		if (i % 10 == 2 || i % 10 == 4 || i % 10 == 5 || i % 10 == 9)
			b = "�� ";
		else
			b = "�� ";
		System.out.println(i + b + a);

	}
}
