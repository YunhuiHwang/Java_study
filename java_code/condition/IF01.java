package org.java_code.condition;

public class IF01 {

	public static void main(String[] args) {
		double n=Math.random();
		
		if(n>=0.5) {
			System.out.println("0.5�̻�");
		}
		
		if(n<0.5) {
			System.out.println("0.5�̸�");
		}

		//�߰�ȣ ��� �ϴ� �� ������ ���ǹ� �� ���̸� �� �ᵵ ��
		//if(n>=0.5) System.out.println("0.5�̻�"); �̷��� �ᵵ ��
		
		double m=Math.random();
		
		if(m>=0.5) {
			System.out.println("0.5�̻�");
		}
		else {
			System.out.println("0.5�̸�");
		}
		//�̷��� ������ ��Ÿ���̶�� if{} else{} �̷��� �� �� ����
		
	}

}
