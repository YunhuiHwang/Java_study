package org.java_code.practice_midterm;

import java.util.Scanner;

public class P4_Squared {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("60201393 È²À±Èñ");
		int a=3, b=4, c=5;
		int x=scn.nextInt();
		double y=a*Math.pow(x,2)+b*x+c;
		System.out.println("y°ªÀº "+(int)y);
	}

}