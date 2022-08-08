package org.java_code.practice_midterm;

import java.util.Scanner;

public class P21_Bigger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 황윤희");
		System.out.print("숫자를 입력하시오: ");
		int i=scn.nextInt(), n=0;
		while (i>n) {
			System.out.print("숫자를 입력하시오: ");
			n=i;
			i=scn.nextInt();
		} System.out.println("종료 ");

		int current = 0;
		System.out.print("숫자를 입력하시오: ");
		int next=scn.nextInt();
		while (current<next) {
			System.out.print("숫자를 입력하시오: ");
			current=next;
			next=scn.nextInt();
		}System.out.println("종료 ");

	}
}
