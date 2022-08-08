package org.java_code.array;

public class Array15 {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				if ((i + j) % 2 == 0)
					matrix[i][j] = 1;
				else
					matrix[i][j] = 0;
			}
		}

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				if(matrix[i][j]==1)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.println();
		}

	}

}
