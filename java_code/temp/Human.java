package org.java_code.temp;

public class Human {

	private String name;
	private int age, weight;

	public Human(String n, int a, int w) {
		this.name = n;
		this.age = a;
		this.weight = w;
	}
//생성자 만들 때 return type 써서 당황하는 경우 많다고 얘기해주셨음
	public Human() {
		this.name = "noname";
		this.age = 0;
		this.weight = 0;
	}

	public void show_info() {
		System.out.println("이름: " + name + " 나이: " + age + "세 몸무게: " + weight + "kg");
	}

	public String show_name() {
		return name;
	}

	public void gain_weight(int w) {
		this.weight += w;
		System.out.println(name + "의 몸무게가 " + weight + "kg이 되었습니다.");
		if (weight >= 100)
			System.out.println("위험합니다. 체중을 줄이세요.");
	}

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 20, 88);
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);

	}

}
