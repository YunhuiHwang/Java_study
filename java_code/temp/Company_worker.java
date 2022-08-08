package org.java_code.temp;

public class Company_worker extends Worker {
	String company_name;

	public Company_worker(int a, String n) {
		super.working_year = a;
		//만약에 int a 말고 int working_year 이런 거 쓰면 super 써줘야 함
		this.company_name = n;
	}

	public static void main(String[] args) {
		Company_worker c = new Company_worker(5, "명지");
	}
}
