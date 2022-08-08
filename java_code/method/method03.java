package org.java_code.method;

import java.util.Scanner;

public class method03 {
	public static int[] sort(int x, int y, int z) {
		int small, middle, big;
		
		if (x>y&& x>z) big=x;
		else if (y>z) big=y;
		else big=z;
		
		if (x>y&& z>y) small=y;
		else if (x>z) small=z;
		else small=x;
		
		if ((x>y&& y>z)||(z>y&&y>x)) middle=y;
		else if ((y>x&& x>z)||(z>x&&x>y)) middle=x;
		else middle=z;
		
		int[] bms = {small, middle, big};
		return bms;
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("서로 다른 세 수를 입력하시오.");
		
		int a= scn.nextInt();
		int b= scn.nextInt();
		int c= scn.nextInt();
		
		int s[] = sort(a, b, c);
		System.out.println(s[0]+ " "+ s[1]+ " " + s[2]);
	}

}
