package org.java_code.final_mock;

public class f_Animal {
	private int weight;
	public f_Animal() {
		
	}
	
	public f_Animal(int w) {
		weight=w;
	}
	
	public void move() {
		System.out.println("움직입니다.");
	}
	
	public int get_weight() {
		return weight;
	}
}
