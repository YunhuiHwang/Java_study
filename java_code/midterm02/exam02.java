package org.java_code.midterm02;

import java.util.Scanner;

public class exam02 {

	public static boolean sosu(int n) {
		int i;
		for (i = 2; i <= n; ++i) {
			if (n % i == 0)
				break;
		}return true;

	}

	public static void main(String[] args) {
		System.out.println("2�� 60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();

		if (sosu(a))
			System.out.print("�Ҽ�");
		else
			System.out.print("�Ҽ��ƴ�");

	}

}
