package org.java_code.practice_midterm;

public class P32_shapes03 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int[][] array01 = new int [5][5];
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				array01[i][j] = ((i+1)*10+j+1);
				System.out.print(array01[i][j] + " ");
			}System.out.println();
		}

	}
}
