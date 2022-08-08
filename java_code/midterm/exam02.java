package org.java_code.midterm;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("2번 60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		int num=scn.nextInt();
		if (num<=0 || num>=27) System.out.println("1부터 26까지의 숫자를 입력하시오.");
		char alp = (char)(num+64);
		System.out.println(alp);
	}

}
