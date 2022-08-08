package org.java_code.array;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int [] num = new int[5];
		
		for (int i=0; i<5; ++i) {
			num[i] = (i+1)*10;
			System.out.println(num[i]);
		}
		
		char [] alp = new char[5];
		
		for (int i=0; i<5; ++i) {
			alp[i] = (char)('a'+i);
			System.out.println(alp[i]);
		}
		
		String [] str = new String[5];
		
		for (int i=0; i<5; ++i) {
			str[i] = scn.next();
		}
		for (int i=0; i<5; ++i) {
			System.out.println(str[i]);
		}

	}

}
