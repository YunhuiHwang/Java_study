package org.java_code.midterm;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		System.out.println("1¹ø 60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		int num =scn.nextInt();
		int mul=1;
		for (int i=1; i<=num; ++i) {
			mul=mul*i;
		}
		System.out.println(num+ "! = "+ mul);
	}

}
