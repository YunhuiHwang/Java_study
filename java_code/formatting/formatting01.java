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
		// �Ҽ����� ǥ���� ������ �ڸ� ������ �ڿ� 0���� ä����
		// %8.2f �̷��� �ϸ� 8�ڸ� ���� �Ű� �Ҽ����� ��°�ڸ����� ��Ÿ���ڴٴ� ����

	}

}
