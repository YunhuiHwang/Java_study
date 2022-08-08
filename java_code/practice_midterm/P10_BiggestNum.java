package org.java_code.practice_midterm;

import java.util.Scanner;

public class P10_BiggestNum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 È²À±Èñ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int biggest = 0;
		if (a >= b && a >= c)
			biggest = a;
		else if (b >= a && b >= c)
			biggest = b;
		else
			biggest = c;
		System.out.println("°¡Àå Å« ¼ö´Â " + biggest);

	}

}
