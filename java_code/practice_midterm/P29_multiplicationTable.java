package org.java_code.practice_midterm;

import java.util.Scanner;

public class P29_multiplicationTable {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		System.out.println("���� �Է��Ͻÿ�.");
		int n=scn.nextInt();
		for (int i=1; i<=9; ++i) {
			System.out.println(n+" x "+i+" = "+n*i);
		}

	}

}
