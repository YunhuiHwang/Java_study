package org.java_code.midterm;

import java.util.Scanner;

public class exam07_2 {

	public static void main(String[] args) {
		System.out.println("7�� 60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);

		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int num = scn.nextInt();
		if (num%3==0) num=0;
		switch(num) {
		case 0:
			System.out.println("3�� ���");
			break;
		default:
			System.out.println("3�� ��� �ƴ�");
		}


	}

}
