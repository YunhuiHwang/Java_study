package org.java_code.practice_midterm;

import java.util.Scanner;

public class P21_Bigger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int i=scn.nextInt(), n=0;
		while (i>n) {
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			n=i;
			i=scn.nextInt();
		} System.out.println("���� ");

		int current = 0;
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int next=scn.nextInt();
		while (current<next) {
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			current=next;
			next=scn.nextInt();
		}System.out.println("���� ");

	}
}
