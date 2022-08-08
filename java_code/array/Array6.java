package org.java_code.array;

public class Array6 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum=0;

		for (int i = 0; i < 5; ++i) {
			sum=sum+arr[i];
		}
		System.out.println("원소의 합: " + sum);
		System.out.println("원소의 평균: " + sum/5);
	}
	
	/*
	 int[] arr = {10, 20, 30, 40, 50};
		int sum=0;
		double avg;

		for (int i = 0; i < arr.length; ++i) {
			sum=sum+arr[i];
		}
		avg=(double)sum/arr.length
		System.out.println("원소의 합: " + sum);
		System.out.println("원소의 평균: " + avg);
	 */

}