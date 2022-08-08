package org.java_code.midterm;

import java.util.Scanner;

public class exam07_3 {
	public static void main(String[] args) {
		System.out.println("7번 60201393 황윤희");
		Scanner scn = new Scanner(System.in);

		System.out.println("숫자를 입력하시오.");
		int num = scn.nextInt();
		switch (num % 3) {
		case 0:
			System.out.println("3의 배수");
			break;
		case 1:
			System.out.println("3의 배수 아님");
			break;
		}

	}

}
