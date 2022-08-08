package org.java_code.finalexam;

public class Salaryman extends Worker {

	private int salary;

	public void increase_salary(int s) {
		salary *= (1 + (double)s/100);
	}

	public Salaryman(String n, boolean m, int sy, int s) {
		super(n, m, sy);
		salary = s;
	}

	public void show_info() {
		super.show_status();
		System.out.println("연봉: " + salary);
	}

	public static void main(String args[]) {
		Salaryman s01 = new Salaryman("이명지", true, 2012, 6000);
		s01.show_info();
		s01.increase_salary(5);
		s01.show_info();
	}
}
