package org.java_code.practice_midterm;

import java.util.Scanner;

public class P17_leapYear {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		if (year%4==0 && year%100!=0 ||year%400==0 )
			System.out.println("����");
		else	
			System.out.println("����ƴ�");
	}

}
