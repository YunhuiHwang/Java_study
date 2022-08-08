package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework06_3_2 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int bigger = 0, smaller = 0, sum = 0, count = 0;
		double avg = 0;
		if (a >= b) {
			bigger = a;
			smaller = b;
		} else {
			bigger = b;
			smaller = a;
		}
		for (int i = 0; smaller <= bigger; ++smaller) {
			sum += smaller;
			++count;
		}
		avg = sum / count;
		System.out.println("µÎ ¼ö »çÀÌ ¸ðµç ¼ö Æò±Õ: " + avg);

	}

}
