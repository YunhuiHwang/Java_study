package org.java_code.array;

public class Array3 {

	public static void main(String[] args) {
		int[] plus = new int[30];
		plus[0]=1; plus[1]=1;
		
		for (int i=2; i<plus.length; ++i) {
			plus[i]= plus[i-1]+plus[i-2];
		}
		for (int  i=0; i<plus.length; ++i) {
			System.out.print(plus[i]+" ");
		}
		

	}

}
