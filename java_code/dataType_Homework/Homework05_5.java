package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework05_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int min=0, max=0, bigger=0;
		if (a>b) bigger=a;
		else bigger=b;
		System.out.print("�ּҰ����: ");
		for( int i=bigger; i>=bigger; i++) {
			if((i % a==0)&&(i % b ==0)) {
				min = i;
				break;
			}
		}
		System.out.println(min);
		System.out.print("�ִ�����: ");
		for (int i = 1; i <= bigger; i++) {
				if ((a % i == 0) && (b % i == 0)) {
					max= i; }  }	
		System.out.println(max);
		
}
}
