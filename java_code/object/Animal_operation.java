package org.java_code.object;

public class Animal_operation extends Animal {
	// 수술을 받는 동물들로, 동물 객체를 상속한다.
	public String date;
	public int period, fee = 100000;
	
	public Animal_operation() {

	}//기본 생성자

	public Animal_operation(String n, String s, String dis, String dia, int a, double w, String d, int p) {
		super(n, s, dis, dia, a, w);
		this.date = d;
		this.period = p;
	}//추가 생성자

	public void operation_info() {
		System.out.println("수술날짜: " + date);
		System.out.println("입원기간: " + period+ "일");
	}

	public void operation_fee() {
		fee += (period * 10000);
		System.out.println("진료비: " + fee);
	}
}