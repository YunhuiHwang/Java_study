package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework08_2 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		System.out.println("입력: ");
		int money = scn.nextInt();

		System.out.println("출력: ");

		int fifty, ten, five, one, coin;
		fifty = money / 50000;
		if (fifty != 0)
			System.out.println("5만원권 " + fifty + "매");
		ten = (money % 50000) / 10000;
		if (ten != 0)
			System.out.println("1만원권 " + ten + "매");
		five = (money % 10000) / 5000;
		if (five != 0)
			System.out.println("5천원권 " + five + "매");
		one = (money % 5000) / 1000;
		if (one != 0)
			System.out.println("1천원권 " + one + "매");
		coin = money % 1000;
		if (coin != 0)
			System.out.println("동전 " + coin + "원");
	}

}
