package org.java_code.mock_midterm;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		char qui = (char) (Math.random() * 3 + 65);
		System.out.println("ABC 중 맞추시오");
		while (true) {
			char qqq = scn.next().charAt(0);
			if (qqq == qui) {
				System.out.println("정답!");
				break;
			} else
				System.out.println("틀렸습니다. 다시 입력하세요.");
		}

	}

}
