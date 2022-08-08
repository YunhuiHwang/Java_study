package org.java_code.object;

public class Animal_treatment extends Animal {
	// 진료만 받는 동물들로, 동물 객체를 상속한다.
	private boolean injection, drug;
	private int fee = 3000;

	public Animal_treatment() {

	}//기본 생성자

	public Animal_treatment(String n, String s, String dis, String dia, int a, double w, boolean i, boolean d) {
		super(n, s, dis, dia, a, w);
		this.injection = i;
		this.drug = d;
	}//추가 생성자

	public void get_injection() {
		if (injection)
			System.out.println("주사 필요");
	}

	public void get_drug() {
		if (drug)
			System.out.println("약 필요");
	}

	public void treatment_fee() {
		if (injection)
			fee += 5000;
		if (drug)
			fee += 5000;
		System.out.println("진료비: " + fee);
	}
}
