package org.java_code.midterm_plus;

import java.util.Scanner;

public class Q7_lowerToUpper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inputString = " ";

		System.out.println("�ܾ �Է����ּ���");
		inputString = scn.next();
		// ������ �ƴ϶� �ܾ� �����Ŵϱ� �׳� next() ���

		char[] change = inputString.toCharArray();
		// ���ڿ��� ���� '�迭'��

		for (int i = 0; i < change.length; i++) {
			// �ܾ� ���̸�ŭ ������

			if (change[i] >= 'A' && change[i] <= 'Z') {
				change[i] = (char) (change[i] + 32);
				// ���� �迭�� ����ִ� ���ĺ��� �� ���ǽĿ� �ش��Ѵٸ�
				// ���� +32 ���־� �ҹ��ڷ� ��ȯ

			} else if (change[i] >= 'a' && change[i] <= 'z') {
				change[i] = (char) (change[i] - 32);
				// ���� �迭�� ����ִ� ���ĺ��� �� ���ǽĿ� �ش��Ѵٸ�
				// ���� -32 ���־� �빮�ڷ� ��ȯ

			} else {
				System.out.println("�߸��� �Է�");
				// ��� �ƴ� ���� �ԷµǾ��� �� ��µǴ� ����
				break;

			}
		}
		System.out.println(change);
	}
}
