package org.java_code.object;

class C {
	static int i = 1;

	void print() {
		int i = 2;
		System.out.println(this.i);
	}
}

public class scope06 {

	public static void main(String[] args) {
		C a01 = new C();
		a01.print();

	}

}
