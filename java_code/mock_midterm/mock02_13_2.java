package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_13_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		char[][] arr = new char[5][5];

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				arr[i][j] = (char) (Math.random() * 3 + 'A');
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("문자를 입력하시오.");
		char n = scn.next().charAt(0);
		print_mat(arr,n);
		

	}
	
	public static void print_mat(char[][] arr, char n) {
	for (int i = 0; i < 5; ++i) {
		for (int j = 0; j < 5; ++j) {
			if (arr[i][j] == n)
				System.out.print(arr[i][j] + " ");
			else
				System.out.print("  ");
		}
		System.out.println();}
	}

}
