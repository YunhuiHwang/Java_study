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
		System.out.println("이름: " + name + " 나이: " + age + "세 몸무게: " + weight + "kg");
	}
	public String show_name() {
		return name;
	}
	public void gain_weight(int w) {
		weight += w;
		System.out.println(name + "의 몸무게가 " + weight + "kg이 되었습니다.");
		if (weight >= 100) {
			System.out.println("위험합니다. 체중을 줄이세요.");
		}
	}
	public static void main(String[] args) {
		f_Human h1 = new f_Human("홍길동", 20, 80);
		f_Human h2 = new f_Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);
	}

}
