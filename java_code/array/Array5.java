package org.java_code.array;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		System.out.println("�ټ� ���� ���� �Է��Ͻÿ�.");

		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];
		int max=0;

		for (int i = 0; i < 5; ++i) {
			num[i] = scn.nextInt();
			if(max<num[i]) max=num[i];
		}
		System.out.print("���� ū ����: " + max);

	}

}
