package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_2 {
	
	public static boolean odd_even(int n) {
		if (n%2==0)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a= scn.nextInt();
		
		if (odd_even(a))
			System.out.print("Â¦¼ö");
		else
			System.out.print("È¦¼ö");

	}

}
