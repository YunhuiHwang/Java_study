package org.java_code.practice_midterm;

public class P32_shapes02 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				if (i<1 || i>3 || j<1 || j>3) 
					System.out.print(" X ");
				else 
					System.out.print( " O ");
			}System.out.println();
		}

	}
}
