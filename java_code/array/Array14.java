package org.java_code.array;

public class Array14 {

	public static void main(String[] args) {
		char[][] matrix = new char[5][5];

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				if ((i + j) % 2 == 0)
					matrix[i][j] = '*';
				else
					matrix[i][j] = ' ';
			}
		}

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
