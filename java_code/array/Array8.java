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
 int �迭�� ���� 1, 0 ���� ������ if �� ���� ��Ƽ�
 1�̸� *, 0�̸� " " ����ϰ� �ص� �� 
 
*/