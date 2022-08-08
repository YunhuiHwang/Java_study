package org.java_code.array;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		System.out.println("다섯 개의 수를 입력하시오.");

		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];
		int max=0;

		for (int i = 0; i < 5; ++i) {
			num[i] = scn.nextInt();
			if(max<num[i]) max=num[i];
		}
		System.out.print("가장 큰 수는: " + max);

	}

}
