package org.java_code.midterm;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		System.out.println("6�� 60201393 Ȳ����");
		System.out.println("�ټ� ���� ���� �Է��Ͻÿ�.");

		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < 5; ++i) {
			num[i] = scn.nextInt();
		}
		System.out.print("����: ");
	
		for (int j = 4; j >= 0; --j) {
			System.out.print(num[j] + " ");
		}

	}

}
