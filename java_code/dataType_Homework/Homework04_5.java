package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework04_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 È²À±Èñ");
		int year = scn.nextInt();
		
		if (year % 400 == 0) System.out.println("À±³â");
		else if (year % 100 == 0) System.out.println("À±³â¾Æ´Ô");
		else if (year % 4 == 0) System.out.println("À±³â");
		else System.out.println("À±³â¾Æ´Ô");
	}

}
