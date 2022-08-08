package org.java_code.object;

class B {
	static int i = 1;

	void print() {
		int i = 2;
		System.out.println(i);
	}
}

public class scope05 {

	public static void main(String[] args) {
		B a01 = new B();
		a01.print();

	}

}
