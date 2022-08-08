package org.java_code.mock_midterm;

import java.util.Scanner;

public class Queston2 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn=new Scanner(System.in);
		int[] num = new int[5];
		int sum=0;
		for (int i=0; i<5; ++i) {
			num[i]=scn.nextInt();
			sum= sum+num[i];			
		}
		System.out.println("ÃÑÇÕÀº  " + sum);

	}
}
