package org.java_code.practice_midterm;

public class P11_Switch {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		int value = 1;

		switch (value) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("�� ���� ��");
		}
/*
 ���⿡�� break �� ����� 1 2 3 �׿��� �� �� ��µǴµ�
 �� ������ ���⼭ case�� ������ �� ������ ã���ִ� ������,
 �� �� ã�� ���� �� ���Ŀ��� ���ǿ� �³� ������ �ʱ� ����
 (�״ϱ� 1 �¾Ƽ� 1�ؿ� �ִ� ���๮���� �� �����ϴ� ��)
 */
	}

}
