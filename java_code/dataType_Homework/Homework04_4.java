package org.java_code.dataType_Homework;

public class Homework04_4 {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		int month=14;
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("31");
				break;
			case 4, 6, 9, 11:
				System.out.println("30");
				break;
			case 2:
				System.out.println("28");
				break;
			default:
				System.out.println("�ش����");
		}
	//���� �Է¹������ ������ ���� ���� �� �ְ� ���� �������ϴ�
	}

}
