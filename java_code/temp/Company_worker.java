package org.java_code.temp;

public class Company_worker extends Worker {
	String company_name;

	public Company_worker(int a, String n) {
		super.working_year = a;
		//���࿡ int a ���� int working_year �̷� �� ���� super ����� ��
		this.company_name = n;
	}

	public static void main(String[] args) {
		Company_worker c = new Company_worker(5, "����");
	}
}
