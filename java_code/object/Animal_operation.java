package org.java_code.object;

public class Animal_operation extends Animal {
	// ������ �޴� �������, ���� ��ü�� ����Ѵ�.
	public String date;
	public int period, fee = 100000;
	
	public Animal_operation() {

	}//�⺻ ������

	public Animal_operation(String n, String s, String dis, String dia, int a, double w, String d, int p) {
		super(n, s, dis, dia, a, w);
		this.date = d;
		this.period = p;
	}//�߰� ������

	public void operation_info() {
		System.out.println("������¥: " + date);
		System.out.println("�Կ��Ⱓ: " + period+ "��");
	}

	public void operation_fee() {
		fee += (period * 10000);
		System.out.println("�����: " + fee);
	}
}