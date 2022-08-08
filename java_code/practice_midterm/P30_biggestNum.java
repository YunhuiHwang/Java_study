package org.java_code.practice_midterm;

import java.util.Scanner;

public class P30_biggestNum {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		int biggest = 0;
		System.out.println("다섯 개의 수를 입력하시오.");
		for (int i = 0; i < 5; ++i) {
			int a = scn.nextInt();
			if (a > biggest)
				biggest = a;
		}
		System.out.println("가장 큰 수는 " + biggest);

	}

}
