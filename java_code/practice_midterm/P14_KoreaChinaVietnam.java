package org.java_code.practice_midterm;

import java.util.Scanner;

public class P14_KoreaChinaVietnam {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);

		String country = scn.next();

		switch (country) {
		case "Korea", "korea":
			System.out.println("���ѹα�");
		    break;
		case "China", "china":
			System.out.println("�߱�");
			break;
		case "Vietnam", "vietnam":
			System.out.println("��Ʈ��");
			break;
		default:
			System.out.println("�ش����");
			break;
		}

	}

}
