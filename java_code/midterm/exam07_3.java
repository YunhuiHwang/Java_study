package org.java_code.midterm;

import java.util.Scanner;

public class exam07_3 {
	public static void main(String[] args) {
		System.out.println("7�� 60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);

		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int num = scn.nextInt();
		switch (num % 3) {
		case 0:
			System.out.println("3�� ���");
			break;
		case 1:
			System.out.println("3�� ��� �ƴ�");
			break;
		}

	}

}
