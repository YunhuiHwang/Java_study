package org.java_code.midterm02;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("8�� 60201393 Ȳ����");
		int[] a = new int[5];

		for (int i = 0; i < a.length; ++i) {
			a[i] = scn.nextInt();
		}
		
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		 int n = scn.nextInt();
		for (int i = 0; i < a.length; ++i) {
			if (n==a[i]) System.out.println("���ԵǾ� ����");
			else if (n==a[i]) System.out.println("���ԵǾ� ���� ����");
		}
		
	}
		

}
