package org.java_code.method;

import java.util.Scanner;

public class method02 {
	
	public static int add(int x, int y) {
		return x+y;
	}
	public static int sub(int x, int y) {
		return x-y;
	}
	public static int mul(int x, int y) {
		return x*y;
	}
	public static double div(int x, int y) {
		return (double)x/y;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");
		
		int a= scn.nextInt();
		int b= scn.nextInt();
		
		System.out.println("두 수의 합은 " + add(a,b));
		System.out.println("두 수의 차는 " + sub(a,b));
		System.out.println("두 수의 곱은 " + mul(a,b));
		System.out.println("두 수의 나눗셈은 " + div(a,b));

	}

}
