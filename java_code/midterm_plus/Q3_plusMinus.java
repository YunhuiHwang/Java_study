package org.java_code.midterm_plus;

import java.util.Scanner;

public class Q3_plusMinus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num=0, big=0, small=0;
		while (num>=0) {
			num= scn.nextInt();
			if (num>big) big=num;
			if(num>=0) small=num;
		}
		System.out.println(big +" " + small);
	}

}
