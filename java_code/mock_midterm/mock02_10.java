package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_10 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		int max=100, min=1, com=0, time=0; 
		
		while(true) {
			com=(int)(Math.random()*(max-min)+min);
			System.out.println(com+ "�Դϱ�?");
			System.out.println("�Է��Ͻÿ�(0:�׺��� �۴�, 1:�׺��� ũ��, 2:�´�)");
			int n=scn.nextInt();
			switch(n) {
			case 0:
				max=com-1;
				time++;
				break;
			case 1:
				min=com+1;
				time++;
				break;
			case 2:
				time++;
				System.out.print("������ " +time+ "������ ������ϴ�.");
				return;
				
			}
		}

		
	}

}
