package org.java_code.temp;

public class Student {
	private int StudentNo;
	private String Name;
	private boolean registered;

	public void showInfo() {
		System.out.println("학번 " + StudentNo + "이름 " + Name + "등록여부 " + registered);
	}

	public void register() {
		if (registered) {
			System.out.println("이미 등록되어 있습니다.");
		} else {
			System.out.println("등록되었습니다.");
			this.registered = true;
		}

	}

	public void leave() {
		if (!registered) {
			System.out.println("이미 휴학 중입니다.");
		} else {
			System.out.println("휴학처리되었습니다.");
			this.registered = false;
		}
	}

	public Student() {
		this.registered = true;
	}

	public Student(int StudentNo, String Name) {
		this();//똑같은 내용 또 써야하면 기본 생성자 그냥 이렇게 쓸 수 있음
		this.StudentNo = StudentNo;
		this.Name = Name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(60201393, "황윤희");
		s1.Name = "송결";
	}

}
