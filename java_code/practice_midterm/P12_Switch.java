package org.java_code.practice_midterm;

import java.util.Scanner;

public class P12_Switch {
	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		String fruit= scn.next();

		switch (fruit) {
		case "���" :
			System.out.println("����");
			break;
		case "����":
			System.out.println("����");
			break;
		case "��":
			System.out.println("����");
			break;
		case "������":
			System.out.println("����");
			break;
		default:
			System.out.println("����");
		}

	}
}
