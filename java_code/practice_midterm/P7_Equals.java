package org.java_code.practice_midterm;

public class P7_Equals {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		String a="aaa";
		String b= a;
		String c=new String("aaa");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));
	}

}

/*
 b�� a�� ���� ���̱� ������ a�� b�� ==���� �� ���� ������ 
 �������� c�� ���Ӱ� "aaa" ������ �Ŷ� ==�� ���ϸ� �ٸ���
 ����. ���ڿ��� ���ϰ� ������ .equals() ���� ��
 �׷��� ���ڿ��� ����� ������ ���ϱ� ������ ���� �Ŷ� ����
*/