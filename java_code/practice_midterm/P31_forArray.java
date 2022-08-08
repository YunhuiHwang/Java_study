package org.java_code.practice_midterm;

public class P31_forArray {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int[][] arr = new int [5][5];
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				arr[i][j] = ((i+j+1)*2*2);
				System.out.print( arr[i][j]);
				//System.out.printf(%d, arr[i][j]);
			}System.out.println();
		}
	}

}
