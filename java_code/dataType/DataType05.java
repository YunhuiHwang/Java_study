package org.java_code.dataType;

public class DataType05 {

	public static void main(String[] args) {
		int a=10, b=3;
		float c=10.0f, d=3.0f;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(a/d);
		
		int e=a/b;
		int f=(int) (a/d);
		//int f = a/d; ��� �ϸ� ���� ��(�Ǽ� ������ ���� �� ���)
		
		System.out.println(e);
		System.out.println(f);

	}

}
