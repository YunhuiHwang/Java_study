package org.java_code.array;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("���� 5���� �Է��Ͻÿ�.");


		int [] num = new int[5];
		int max = 0;
		
		for (int i=0; i<5; ++i) {
			num[i] = scn.nextInt();
			if(max < num[i]) max= num[i];
		}
		System.out.println("���� ū ��: " +max);

	}

}
