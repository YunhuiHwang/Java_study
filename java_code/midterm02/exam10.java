package org.java_code.midterm02;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		System.out.println("10번 60201393 황윤희");
		Scanner scn = new Scanner(System.in);

		int[] com = new int[10];
		int[] human = new int[10];

		for (int i = 0; i < 3; ++i) {
			int num = (int) (Math.random() * 10);
			if (com[num] == 0)
				com[num] = 1;
			else
				--i;
		}

		System.out.println("세 숫자를 입력하시오.");
		for (int i = 0; i < 3; ++i) {
			human[scn.nextInt() - 1] = 1;
		}

		System.out.println("컴퓨터");
		for (int i = 0; i < 10; ++i) {
			if (com[i] == 1)
				System.out.print((i + 1) + " ");
		}

		int count = 0;
		for (int i = 0; i < 10; ++i) {
			if (com[i] * human[i] == 1)
				count++;
		}
		
		switch(count) {
		case 3: System.out.println("\n3 Strike");
		break;
		case 2: System.out.println("\n2 Strike 1 Ball");
		break;
		case 1: System.out.println("\n1 Strike 2 Ball");
		break;
		default: System.out.println("\3 Ball");
		}

	}

}
