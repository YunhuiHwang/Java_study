package org.java_code.summerStudy;

import java.util.Scanner;

public class receipt_25304 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int N = scn.nextInt();
		int XX = 0;
		
		for(int i = 0; i<N; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			XX += a*b;
		}
		if(X==XX) System.out.println("Yes");
		else System.out.println("No");
	}
}