package org.java_code.object;

public class Animal {
	// 병원을 방문하는 동물들의 특징을 객체화
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
	}//기본 생성자

	public Animal(String n, String s, String dis, String dia, int a, double w) {
		this.name = n;
		this.species = s;
		this.disease = dis;
		this.diagonosis = dia;
		this.age = a;
		this.weight = w;
	}//추가 생성자

	public void animal_info() {
		System.out.println("이름: " + name);
		System.out.println("종: " + species);
		System.out.println("나이: " + age);
		System.out.println("몸무게: " + weight);
		System.out.println("내원 사유: " + disease);
		System.out.println("진찰 내용: " + diagonosis);
	}
}