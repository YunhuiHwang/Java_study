package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework08_2 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		System.out.println("�Է�: ");
		int money = scn.nextInt();

		System.out.println("���: ");

		int fifty, ten, five, one, coin;
		fifty = money / 50000;
		if (fifty != 0)
			System.out.println("5������ " + fifty + "��");
		ten = (money % 50000) / 10000;
		if (ten != 0)
			System.out.println("1������ " + ten + "��");
		five = (money % 10000) / 5000;
		if (five != 0)
			System.out.println("5õ���� " + five + "��");
		one = (money % 5000) / 1000;
		if (one != 0)
			System.out.println("1õ���� " + one + "��");
		coin = money % 1000;
		if (coin != 0)
			System.out.println("���� " + coin + "��");
	}

}
