package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework06_5 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		int quiz = (int)(Math.random()*10+1);
		System.out.println("���ڸ��߱� ����!(1~10)");
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int answer=scn.nextInt();
			if (answer>quiz) {
				System.out.println("���亸�� Ů�ϴ�.");
			}
			else if (answer==quiz) {
				System.out.println("�����Դϴ�.");
				break;
			}
			else {
				System.out.println("���亸�� �۽��ϴ�.");
			}
		}
	}
}
