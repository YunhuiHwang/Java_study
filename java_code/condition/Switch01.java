package org.java_code.condition;

public class Switch01 {

	public static void main(String[] args) {
		int value=1;
		
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
		//���⼭ break; �� �ϸ� case1,2,3 default���� �� ��µ�
		
		String fruit ="���";
		
		switch (fruit) {
		case "���":
			System.out.println("����");
			break;
		case "����":
			
			System.out.println("����");
			break;
		case "��":
			System.out.println("����");
			break;
		default:
			System.out.println("����");
		
		}
		//�̷� ������ ���ڵ� �԰���
		//�� ��쿡�� ����� ���� ��°� �����ϱ� ��� �ؿ� �� �� ������ ��� ����
		//break�Ǳ� �������� ��� �Ǵϱ�
		
	}
		
}
