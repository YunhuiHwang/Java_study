package org.java_code.mock_midterm;

import java.util.Scanner;
import java.util.Arrays;

public class mock02_15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] lotto = new int[20];
		int[] human = new int[20];

		for (int i = 0; i < 4; ++i) {
			int num = (int) (Math.random() * 20);
			if (lotto[num] == 0)
				lotto[num] = 1;
			else
				--i;
		}

		System.out.println("�� ���ڸ� �Է��Ͻÿ�.");
		for (int i = 0; i < 4; ++i) {
			human[scn.nextInt() - 1] = 1;
		}

		System.out.println("��÷��ȣ��");
		for (int i = 0; i < 20; ++i) {
			if (lotto[i] == 1)
				System.out.print((i + 1) + " ");
		}

		int count = 0;
		for (int i = 0; i < 20; ++i) {
			if (lotto[i] * human[i] == 1)
				count++;
		}
		
		switch(count) {
		case 4: System.out.println("\n1��!");
		break;
		case 3: System.out.println("\n2��!");
		break;
		case 2: System.out.println("\n3��!");
		break;
		default: System.out.println("\n��!");
		}

	}

}
