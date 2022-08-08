package org.java_code.midterm02;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("8번 60201393 황윤희");
		int[] a = new int[5];

		for (int i = 0; i < a.length; ++i) {
			a[i] = scn.nextInt();
		}
		
		System.out.println("숫자를 입력하시오.");
		 int n = scn.nextInt();
		for (int i = 0; i < a.length; ++i) {
			if (n==a[i]) System.out.println("포함되어 있음");
			else if (n==a[i]) System.out.println("포함되어 있지 않음");
		}
		
	}
		

}
