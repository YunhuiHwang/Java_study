package org.java_code.dataType_Homework;

import java.util.Scanner;

public class DataType_Homework03_3 {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		System.out.println("y = 3x^2+4x+5 �� �� x�� ���� �Է��Ͻÿ�.");
		System.out.print("x = ");
		int y, x = scn.nextInt();
		y = (int) (3 * Math.pow(x, 2) + 4 * x + 5);
		System.out.println("y = " + y);
	}

}
