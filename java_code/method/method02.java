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
		System.out.println("�� ���� �Է��Ͻÿ�.");
		
		int a= scn.nextInt();
		int b= scn.nextInt();
		
		System.out.println("�� ���� ���� " + add(a,b));
		System.out.println("�� ���� ���� " + sub(a,b));
		System.out.println("�� ���� ���� " + mul(a,b));
		System.out.println("�� ���� �������� " + div(a,b));

	}

}
