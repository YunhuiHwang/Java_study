package org.java_code.midterm;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		System.out.println("3�� 60201393 Ȳ����");
		
		Scanner scn = new Scanner(System.in);
		int biggest = 0, smallest = 10000;
		System.out.print("�����Է�: ");
		for (int i = 0; i < 5; ++i) {
			int a = scn.nextInt();
			if (a > biggest)
				biggest = a;
			if (a<smallest)
				smallest =a;
		}
		System.out.println("�ּ�: " + smallest);
		System.out.println("�ִ�: " + biggest);
	}

}
