package org.java_code.object;

public class Animal {
	// ������ �湮�ϴ� �������� Ư¡�� ��üȭ
	private String name, species, disease, diagonosis;
	private int age;
	private double weight;

	public Animal() {
		this.name = "noname";
		this.species = "nospecies";
		this.disease = "nodisease";
		this.diagonosis = "noinfo";
		this.age = 0;
		this.weight = 0;
	}//�⺻ ������

	public Animal(String n, String s, String dis, String dia, int a, double w) {
		this.name = n;
		this.species = s;
		this.disease = dis;
		this.diagonosis = dia;
		this.age = a;
		this.weight = w;
	}//�߰� ������

	public void animal_info() {
		System.out.println("�̸�: " + name);
		System.out.println("��: " + species);
		System.out.println("����: " + age);
		System.out.println("������: " + weight);
		System.out.println("���� ����: " + disease);
		System.out.println("���� ����: " + diagonosis);
	}
}