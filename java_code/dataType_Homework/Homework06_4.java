package org.java_code.dataType_Homework;

public class Homework06_4 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int[][] homework = new int[5][5];
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				homework[i][j] = (i + 2 * j + 1);
			}
		}
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				System.out.print(homework[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
