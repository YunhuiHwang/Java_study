package org.java_code.midterm02;

import java.util.Scanner;

public class exam01 {
	
	public static int sum(int a) {
		int hap=0;
		for (int i=1; i<=a; ++i) {
			hap+=i;
			
		}return hap;
	}

	public static void main(String[] args) {
		System.out.println("1¹ø 60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(sum(num));

	}

}
