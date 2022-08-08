package org.java_code.summerStudy;

import java.util.Scanner;

public class repetition_2495 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count=1;
		int[] max = new int[3]; 
		
		for (int i = 0; i < 3; i++) {
			String N = scn.next();
			char num = N.charAt(0);

			for (int j = 1; j < N.length(); j++) {
				if (N.charAt(j)==num) count++;
				else {
					num=N.charAt(j);
					count=1;
				}
				if(count>= max[i]) max[i]=count;
				//Math.max(a,b) 이런 함수 써서 비교해도 된대
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(max[i]);
		}
	}
}