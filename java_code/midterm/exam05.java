package org.java_code.midterm;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		System.out.println("5¹ø 60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for (int i = 1; i <= num; ++i) {
			if (i % 2 == 0)
				continue;
			System.out.print(i+ "  ");
		}

	}
}
