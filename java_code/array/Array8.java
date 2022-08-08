package org.java_code.array;

public class Array8 {

	public static void main(String[] args) {
		char[][] matrix = new char[5][5];

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < 5; ++j) {
				if ((i + j) % 2 == 0)
					matrix[i][j] = '*';
				else
					matrix[i][j] = ' ';

			}
		}

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
 int 배열로 만들어서 1, 0 넣은 다음에 if 로 조건 삼아서
 1이면 *, 0이면 " " 출력하게 해도 됨 
 
*/