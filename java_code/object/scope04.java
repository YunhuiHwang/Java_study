package org.java_code.object;

class A {
	static int i = 1;

	void print() {
		System.out.println(i);
	}
}

public class scope04 {

	public static void main(String[] args) {
		A a01 = new A();
		a01.print();

	}

}
