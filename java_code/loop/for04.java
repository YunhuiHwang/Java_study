package org.java_code.loop;

public class for04 {

	public static void main(String[] args) {
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print(" *  ");
			}
			System.out.println();
		}
		
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
		
		for (int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				System.out.print((1+j)+" ");
			}
			System.out.println();
		}

	}
}
