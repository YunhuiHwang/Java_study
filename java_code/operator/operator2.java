package org.java_code.operator;

public class operator2 {

	public static void main(String[] args) {
		double a,b;
		a=Math.random();
		b=Math.random();
		System.out.println("ù��°��: "+a);
		System.out.println("�ι�°��: "+b);
		
		System.out.println("ù��° ���� �ι�°������ ū ����"+(a>b));
		
		a=Math.round(a);
		//a�� �Ҽ��� ù°�ڸ����� �ݿø�
		System.out.println("ù��°��: "+a);
		b=(double)(Math.round(b*10))/10;
		//�Ҽ��� ��°�ڸ����� �ǰ� �ϰ� ������! �̷������� 10, 100, 1000 �� ���ϰų� ������ ����
		//�տ� (double) �� ���� 0.0 ���´�.
		System.out.println("�ι�°��: "+b);
		System.out.println("ù��° ���� �ι�° ������ ū ���� "+(a>b));

	}

}
