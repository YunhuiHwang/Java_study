package org.java_code.condition;

import java.util.Scanner;

public class IF03 {
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("���� ū ���� "+a);
		}
		else if (b>c) {
			System.out.println("���� ū ���� "+b);
		}
		else {
			System.out.println("���� ū ���� "+c);
		}
		//�ݺ��� �ʹ� ���Ƽ� ���� �����ϱ� max���� �� �����ؼ� �� �ְ� ���ǽ� �� ���� �� max ����ص� ��
		
	}

}
