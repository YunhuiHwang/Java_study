package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework06_2 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��Ͻÿ�.");
		char a= scn.next().charAt(0);
		while(true) {
			String b= scn.next();
			if(b.charAt(0)<=a) a=b.charAt(0);
			if(b.equals("quit")) break;
		}
		System.out.println("���� ���� ���ĺ��� " +a);
	}
}
