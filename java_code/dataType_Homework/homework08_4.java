package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework08_4 {
	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		
		char[] order = new char[5];
		char alp;
		for (int i = 0; i < order.length; ++i) {
			while(true) {
				alp=scn.next().charAt(0);
				if(alp>='a'&& alp<='z') break;
			} order[i]=alp;
		}

		for (int i = 0; i < order.length - 1; ++i) {
			for (int j = 0; j < order.length - 1 - i; ++j) {
				if (order[j] > order[j + 1]) {
					char temp = order[j + 1];
					order[j + 1] = order[j];
					order[j] = temp;
				}
				
			}

		}
		for (int i = 0; i < order.length; ++i) {
			System.out.print(order[i] + " ");
		}
	}

}
