package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework10_01 {
	
	public static String sum(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫번째 문자열? ");
		String first =scn.next();
		System.out.print("두번째 문자열? ");
		String second =scn.next();
		System.out.println("결과: " + sum(first,second));
		
	}

}
