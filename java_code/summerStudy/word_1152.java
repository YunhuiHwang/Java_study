package org.java_code.summerStudy;

import java.util.Scanner;

public class word_1152 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        sc.close();
        if(s.equals(" ")) System.out.println(0);
        //�� �κ��� ������ ���鸸 �Է� �� 1 ���ͼ� Ʋ���� ��
        else System.out.println(s.trim().split(" ").length);
	}
}