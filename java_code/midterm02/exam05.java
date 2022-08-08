package org.java_code.midterm02;

public class exam05 {

	public static void main(String[] args) {
		System.out.println("5¹ø 60201393 È²À±Èñ");
		int[][] arr = new int [5][5];
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				arr[i][j] = ((2*(i+1))*(2*(j+1)));
				System.out.printf("%-3d", arr[i][j]);
			}System.out.println();
		}
	}

}
