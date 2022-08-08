package org.java_code.final_mock;

class A{
	int i =1;
	
	void print() {
	    int i=2;
		System.out.println(this.i);
	}

}
public class change {
	public static void main(String[] args) {
	
		A a01 = new A();
		a01.print();
	}
	
}


