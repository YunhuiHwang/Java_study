package org.java_code.mock_midterm;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int[][] array = new int [5][5];
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				array[i][j]= (int)(Math.random()*10);
				System.out.print(array[i][j] +"  ");
			}
			System.out.println();
		}

	}

}
