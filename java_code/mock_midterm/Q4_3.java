package org.java_code.mock_midterm;

public class Q4_3 {

	public static void main(String[] args) {
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				if (i%2==0) {
					if(j%2==0) System.out.print("1 ");
					else System.out.print("-1 ");
				}else {
					if(j%2==0) System.out.print("-1 ");
					else System.out.print("1 ");
				}
			}System.out.println();
		}

	}

}
