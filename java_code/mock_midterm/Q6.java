package org.java_code.mock_midterm;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
		char qui = (char) (Math.random() * 3 + 65);
		System.out.println("ABC �� ���߽ÿ�");
		while (true) {
			char qqq = scn.next().charAt(0);
			if (qqq == qui) {
				System.out.println("����!");
				break;
			} else
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");
		}

	}

}
