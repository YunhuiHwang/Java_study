package org.java_code.practice_midterm;

public class P32_shapes01 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				if (i%2==0) {
					if(j%2==0) System.out.print(" * ");
					else System.out.print("    ");
				}else {
					if(j%2==0) System.out.print("    ");
					else System.out.print(" * ");
				}
			}System.out.println();
		}

	}

}
/*
 
*  *  *
  *  *
*  *  *
  *  *
*  *  *

*/