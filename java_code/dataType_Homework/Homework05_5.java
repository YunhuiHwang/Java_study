package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework05_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 황윤희");
		System.out.print("두 수를 입력하시오: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int min=0, max=0, bigger=0;
		if (a>b) bigger=a;
		else bigger=b;
		System.out.print("최소공배수: ");
		for( int i=bigger; i>=bigger; i++) {
			if((i % a==0)&&(i % b ==0)) {
				min = i;
				break;
			}
		}
		System.out.println(min);
		System.out.print("최대공약수: ");
		for (int i = 1; i <= bigger; i++) {
				if ((a % i == 0) && (b % i == 0)) {
					max= i; }  }	
		System.out.println(max);
		
}
}
