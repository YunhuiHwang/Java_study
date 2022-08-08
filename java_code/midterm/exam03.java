package org.java_code.midterm;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		System.out.println("3번 60201393 황윤희");
		
		Scanner scn = new Scanner(System.in);
		int biggest = 0, smallest = 10000;
		System.out.print("숫자입력: ");
		for (int i = 0; i < 5; ++i) {
			int a = scn.nextInt();
			if (a > biggest)
				biggest = a;
			if (a<smallest)
				smallest =a;
		}
		System.out.println("최소: " + smallest);
		System.out.println("최대: " + biggest);
	}

}
