package org.java_code.array;

public class Array13 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[0].length; ++j) {
				sum += arr[i][j];
			}
		}
		avg = (double) sum / (arr.length * arr[0].length);

		System.out.println("Че: " + sum);
		System.out.println("ЦђБе: " + avg);
	}

}
