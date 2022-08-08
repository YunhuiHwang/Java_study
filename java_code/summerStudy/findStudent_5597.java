package org.java_code.summerStudy;

import java.util.Scanner;

public class findStudent_5597 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] stu = new int[10];

		for (int i = 0; i < 8; i++) {
			int submit = scn.nextInt();
			stu[submit-1] = 1;
		}
		for (int i = 0; i < 10; i++) {
			if (stu[i] != 1)
				System.out.println(i+1);
		}
	}
}