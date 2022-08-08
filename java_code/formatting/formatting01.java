package org.java_code.formatting;

public class formatting01 {

	public static void main(String[] args) {
		System.out.println("Name" + "Total" + "Avg");
		System.out.println("Jones " + 950 + " " + 80.2436);
		System.out.println("Tom " + 1050 + " " + 90.43);

		System.out.printf("%s %s %s\n", "Name", "Total", "Avg");
		System.out.printf("%s %d %f\n", "Jones ", 950, 80.2436);
		System.out.printf("%s %d %f\n", "Tom ", 1050, 90.43);

		System.out.printf("%8s %8s %8s\n", "Name", "Total", "Avg");
		System.out.printf("%8s %8d %8.2f\n", "Jones ", 950, 80.2436);
		System.out.printf("%8s %8d %8.2f\n", "Tom ", 1050, 90.43);
		// 소수점은 표현될 수보다 자리 넓으면 뒤에 0으로 채워짐
		// %8.2f 이렇게 하면 8자리 받을 거고 소수점은 둘째자리까지 나타내겠다는 뜻임

	}

}
