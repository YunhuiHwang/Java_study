package org.java_code.midterm;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		System.out.println("6번 60201393 황윤희");
		System.out.println("다섯 개의 수를 입력하시오.");

		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < 5; ++i) {
			num[i] = scn.nextInt();
		}
		System.out.print("역순: ");
	
		for (int j = 4; j >= 0; --j) {
			System.out.print(num[j] + " ");
		}

	}

}
