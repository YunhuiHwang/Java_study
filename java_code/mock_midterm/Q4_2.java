package org.java_code.mock_midterm;

public class Q4_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i == j || (i+j)==4)
					System.out.print("    ");
				else
					System.out.print("O ");
			}System.out.println();
		}
	}
}
