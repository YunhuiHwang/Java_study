package org.java_code.mock_midterm;

import java.util.Arrays;

public class mock02_1 {
	
	public static int get_max(int a[]) {
		Arrays.sort(a);
		return a[a.length-1];
	}
	/*
	 int max=0;
	 for (int i=0; i<5; ++i){
	 	if (a[i]>max) max=a[i];
	 }
	 return max;
	 
	 */


	public static void main(String[] args) {
		int [] arr = {3, 6, 8, 2, 1};
		System.out.println("최대값은 "+ get_max(arr));

	}

}
