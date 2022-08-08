package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework05_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 황윤희");
		System.out.println("실행결과)");
		int i = scn.nextInt();
		String a = " ";
		String b = " ";
		if (i == 1)
			a = "소수가 아닙니다.";
		for (int j = 2; j < i; ++j) {
			if (i % j == 0)
				a = " 소수가 아닙니다.";
			else
				a = " 소수입니다.";

		}
		if (i % 10 == 2 || i % 10 == 4 || i % 10 == 5 || i % 10 == 9)
			b = "는 ";
		else
			b = "은 ";
		System.out.println(i + b + a);

	}
}
