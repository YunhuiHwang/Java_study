package org.java_code.practice_midterm;

import java.util.Scanner;

public class P30_biggestNum {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		int biggest = 0;
		System.out.println("�ټ� ���� ���� �Է��Ͻÿ�.");
		for (int i = 0; i < 5; ++i) {
			int a = scn.nextInt();
			if (a > biggest)
				biggest = a;
		}
		System.out.println("���� ū ���� " + biggest);

	}

}
