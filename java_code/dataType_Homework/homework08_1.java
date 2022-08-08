package org.java_code.dataType_Homework;

import java.util.Arrays;

public class homework08_1 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int[][] mul = new int[9][9];

		for (int i = 0; i < 9; ++i) {
			for (int j = 8; j >= 0; --j) {
				mul[i][j] = (i + 1) * (j+1);
				System.out.printf("%-3d", mul[i][j]);
			}
			System.out.println();
		}
	}

}
