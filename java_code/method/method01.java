package org.java_code.method;

import java.util.Scanner;

public class method01 {
	
	public static int max(int x, int y) {
		if (x>y) return x;
		else return y;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�.");
		
		int a= scn.nextInt();
		int b= scn.nextInt();
		
		System.out.println("ū ���� "+max(a,b)+ "�Դϴ�.");
	}

}
