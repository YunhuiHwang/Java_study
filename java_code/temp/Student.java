package org.java_code.temp;

public class Student {
	private int StudentNo;
	private String Name;
	private boolean registered;

	public void showInfo() {
		System.out.println("�й� " + StudentNo + "�̸� " + Name + "��Ͽ��� " + registered);
	}

	public void register() {
		if (registered) {
			System.out.println("�̹� ��ϵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println("��ϵǾ����ϴ�.");
			this.registered = true;
		}

	}

	public void leave() {
		if (!registered) {
			System.out.println("�̹� ���� ���Դϴ�.");
		} else {
			System.out.println("����ó���Ǿ����ϴ�.");
			this.registered = false;
		}
	}

	public Student() {
		this.registered = true;
	}

	public Student(int StudentNo, String Name) {
		this();//�Ȱ��� ���� �� ����ϸ� �⺻ ������ �׳� �̷��� �� �� ����
		this.StudentNo = StudentNo;
		this.Name = Name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(60201393, "Ȳ����");
		s1.Name = "�۰�";
	}

}
