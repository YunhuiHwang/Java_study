package org.java_code.midterm;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("2�� 60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		System.out.print("�Է�: ");
		int num=scn.nextInt();
		if (num<=0 || num>=27) System.out.println("1���� 26������ ���ڸ� �Է��Ͻÿ�.");
		char alp = (char)(num+64);
		System.out.println(alp);
	}

}
