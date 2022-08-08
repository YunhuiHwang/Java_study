package org.java_code.loop;

import java.util.Scanner;

public class whileFor01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int i = 1, n=scn.nextInt();
		int  sumi = 0, sumj=0;
		while (i <= n) {
			System.out.print(i);
			if(i<n) System.out.print(" + ");
			else System.out.print(" = ");
			sumi = sumi + i;
			i++;
		}
		System.out.println(sumi);
		
		
		for(int j=1; j<=n; ++j){
			System.out.print(j);
			if(j<n) System.out.print(" + ");
			else System.out.print(" = ");
			sumj = sumj + j;
		}
		System.out.println(sumj);
	}

}
