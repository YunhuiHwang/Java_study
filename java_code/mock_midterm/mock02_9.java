package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_9 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		
		int n=scn.nextInt();
		int i;
		
		for (i=2; i<=n; ++i){
			if (n%i==0)break;
		}
		
		if (i<n) System.out.println(i+"�� ���");
		else System.out.println("�Ҽ�");

		
	}

}
