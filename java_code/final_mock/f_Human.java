package org.java_code.final_mock;

public class f_Human {
	private String name;
	private int age, weight;

	public f_Human() {
		name = "noname";
		age = 0;
		weight = 0;
	}
	public f_Human(String n, int a, int w) {
		name = n;
		age = a;
		weight = w;
	}
	public void show_info() {
		System.out.println("�̸�: " + name + " ����: " + age + "�� ������: " + weight + "kg");
	}
	public String show_name() {
		return name;
	}
	public void gain_weight(int w) {
		weight += w;
		System.out.println(name + "�� �����԰� " + weight + "kg�� �Ǿ����ϴ�.");
		if (weight >= 100) {
			System.out.println("�����մϴ�. ü���� ���̼���.");
		}
	}
	public static void main(String[] args) {
		f_Human h1 = new f_Human("ȫ�浿", 20, 80);
		f_Human h2 = new f_Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);
	}

}
