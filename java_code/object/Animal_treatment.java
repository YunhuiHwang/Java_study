package org.java_code.object;

public class Animal_treatment extends Animal {
	// ���Ḹ �޴� �������, ���� ��ü�� ����Ѵ�.
	private boolean injection, drug;
	private int fee = 3000;

	public Animal_treatment() {

	}//�⺻ ������

	public Animal_treatment(String n, String s, String dis, String dia, int a, double w, boolean i, boolean d) {
		super(n, s, dis, dia, a, w);
		this.injection = i;
		this.drug = d;
	}//�߰� ������

	public void get_injection() {
		if (injection)
			System.out.println("�ֻ� �ʿ�");
	}

	public void get_drug() {
		if (drug)
			System.out.println("�� �ʿ�");
	}

	public void treatment_fee() {
		if (injection)
			fee += 5000;
		if (drug)
			fee += 5000;
		System.out.println("�����: " + fee);
	}
}
