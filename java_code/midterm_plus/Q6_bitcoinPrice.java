package org.java_code.midterm_plus;

import java.util.Scanner;

public class Q6_bitcoinPrice {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		System.out.print("입력(20년 전 비트코인 갯수): ");
		int bit = scn.nextInt();
		System.out.println("출력(현재 자산): "+ bit*85000000);
	}

}
