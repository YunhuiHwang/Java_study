package org.java_code.summerStudy;

import java.util.Scanner;

public class tenWords_11721 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word =scn.next();
		int n=(word.length())/10+1;
		//�̰� �׳� word/10�̷��� �ص� �ȴ�
		for (int i=0; i<n; i++) {
			System.out.println(word.substring(10*i,10*(i+10)));
		}
		//�̰� ������ �Ѿ�� �ʰ� �Ϸ��� ���� �ϳ��� ���� �� ���ں��� ������ ��µȴ�
	}

}
