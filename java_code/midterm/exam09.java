package org.java_code.midterm;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		System.out.println("9�� 60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		System.out.println("���������� �� �ϳ��� ���ÿ�.( 1.����, 2.����, 3.��)");
		int me =scn.nextInt();
		int com = (int) (Math.random() * 3 + 1);
		System.out.println("��: " + me);
		System.out.println("��ǻ��: " +com);
		
		if (me==com) {
			System.out.println("���º�");
		}
		else if((me==1&&com==3)||(me==2&&com==1)|| (me==3&&com==2))
			System.out.println("�� ��");
		else
			System.out.println("��ǻ�� ��");
		
	}

}
