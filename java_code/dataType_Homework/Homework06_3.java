package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework06_3 {
	
	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int sum=0, count=0 ; double avg=0;
		if (a>=b) {
			for(int i=0; b<=a; ++b) {
				sum+=b;
				++count;
			}
		}
		else {
			for(int i=0; a<=b; ++a) {
				sum+=a;
				++count;
			}
		}
		avg=sum/count;
		System.out.println("µÎ ¼ö »çÀÌ ¸ðµç ¼ö Æò±Õ: "+ avg);
	}
}
