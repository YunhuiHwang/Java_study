package org.java_code.array;

public class Array7 {

	public static void main(String[] args) {
		int[][] arr = {{5, 5, 5, 5, 5}, {10,10, 10, 10, 10}};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; ++j) {
				sum+=arr[i][j];
			}
		}
		System.out.println("원소의 합: " + sum);
		System.out.println("원소의 평균: " + (double)sum/(arr.length*arr[0].length));
	}

}
