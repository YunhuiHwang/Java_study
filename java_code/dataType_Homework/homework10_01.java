package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework10_01 {
	
	public static String sum(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		
		System.out.print("ù��° ���ڿ�? ");
		String first =scn.next();
		System.out.print("�ι�° ���ڿ�? ");
		String second =scn.next();
		System.out.println("���: " + sum(first,second));
		
	}

}
