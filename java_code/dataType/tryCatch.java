package org.java_code.dataType;

public class tryCatch {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("0���� �������ϴ�.");
		}

	}

}
