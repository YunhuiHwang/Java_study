package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework09_1 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		
		char[] name = {'Y', 'u', 'n', 'h', 'e', 'e'};
		System.out.print("�� ��° ���ĺ��� ����Ʈ�ұ��? ");
		int num=scn.nextInt();
		
		if(num-1<name.length)
			System.out.println(name[(num-1)]);
		else 
			System.out.println("������ ������ϴ�.");

	}

}
