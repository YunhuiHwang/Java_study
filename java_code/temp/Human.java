package org.java_code.temp;

public class Human {

	private String name;
	private int age, weight;

	public Human(String n, int a, int w) {
		this.name = n;
		this.age = a;
		this.weight = w;
	}
//������ ���� �� return type �Ἥ ��Ȳ�ϴ� ��� ���ٰ� ������ּ���
	public Human() {
		this.name = "noname";
		this.age = 0;
		this.weight = 0;
	}

	public void show_info() {
		System.out.println("�̸�: " + name + " ����: " + age + "�� ������: " + weight + "kg");
	}

	public String show_name() {
		return name;
	}

	public void gain_weight(int w) {
		this.weight += w;
		System.out.println(name + "�� �����԰� " + weight + "kg�� �Ǿ����ϴ�.");
		if (weight >= 100)
			System.out.println("�����մϴ�. ü���� ���̼���.");
	}

	public static void main(String[] args) {
		Human h1 = new Human("ȫ�浿", 20, 88);
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);

	}

}
