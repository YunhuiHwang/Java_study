package org.java_code.dataType;

public class DataType04 {

	public static void main(String[] args) {
		int a=3;
		a=a+1;  
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		//���⼭ 2 �����Ȱ� �ƴ϶� ���ٿ��� 1+1 ���ٿ��� +1 �Ȱ���
		/*
		 ++a�� ���� ��
		 a++�ε� �� ��  �ִµ� ���� ���� �� ����
		 System.out.println(++a); �̰� a=a+1 �� �� ���
		 System.out.println(a++); �̰� a ��� �� a�� a+1 ����
		 */
		double d;
		int b;
		d=3.5;
		b=(int)d;
		System.out.println(b);
		//�Ǽ� ������ ������ �����κи� ���´�.
	}

}

