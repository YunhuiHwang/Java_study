package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_12 {
	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int max=0;

		for (int i = 0; i<arr.length; ++i) {
			System.out.println((i+1)+"��° �л��� ������?");
			for (int j = 0; j <arr[i].length; ++j) {
				arr[i][j] = scn.nextInt();
				if(arr[i][j]> max) max=arr[i][j];
			}
		}

		System.out.println("�ִ밪��"+max);
	}
	

}
