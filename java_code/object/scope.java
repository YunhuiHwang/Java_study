package org.java_code.object;

public class scope {

	static void test() {
		int i = 0;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			test();
			System.out.println(i);
		}

	}

}
