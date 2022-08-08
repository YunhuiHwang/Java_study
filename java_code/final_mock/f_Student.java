package org.java_code.final_mock;

public class f_Student extends f_Human {

	String std_no;

	public f_Student() {
		super();
		std_no = "60200000";
	}

	public f_Student(String n, int a, int w, String s) {
		super(n, a, w);
		std_no = s;
	}

	public void study(int h) {
		System.out.println(super.show_name() + "님이 " + h + "시간동안 공부했습니다.");
	}

	public static void main(String[] args) {
		f_Student s1 = new f_Student("홍길동", 20, 88, "60191234");
		f_Student s2 = new f_Student();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}

}
