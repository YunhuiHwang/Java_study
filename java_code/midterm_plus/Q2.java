package org.java_code.midterm_plus;

public class Q2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (j == 2) 
					System.out.print((i + 1));
				else if (i == 2)
						System.out.print(" "+ (j + 1)+" ");
				else
					System.out.print(" * ");

			}
			System.out.println();
		}

	}

}
