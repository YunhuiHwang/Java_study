package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework04_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		int year = scn.nextInt();
		
		if (year % 400 == 0) System.out.println("����");
		else if (year % 100 == 0) System.out.println("����ƴ�");
		else if (year % 4 == 0) System.out.println("����");
		else System.out.println("����ƴ�");
	}

}
