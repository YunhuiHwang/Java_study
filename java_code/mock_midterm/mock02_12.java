package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_12 {
	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int max=0;

		for (int i = 0; i<arr.length; ++i) {
			System.out.println((i+1)+"번째 학생의 점수는?");
			for (int j = 0; j <arr[i].length; ++j) {
				arr[i][j] = scn.nextInt();
				if(arr[i][j]> max) max=arr[i][j];
			}
		}

		System.out.println("최대값은"+max);
	}
	

}
