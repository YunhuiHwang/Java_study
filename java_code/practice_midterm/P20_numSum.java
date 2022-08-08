package org.java_code.practice_midterm;

import java.util.Scanner;

public class P20_numSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("60201393 황윤희");
		System.out.print("숫자를 입력하시오: ");
		int a = scn.nextInt();
		int i = 1, sumi = 0, sumj=0;
		while (i <= a) {
			if (i != a) {
				System.out.print(i + "+");
				sumi += i;
				++i;
			} else {
				sumi += i;
				System.out.print(i + "=" +sumi);
				++i;
			}
		}
		System.out.println(
				);
	
		for(int j=1; j<=a; ++j) {
			if (j != a) {
				System.out.print(j + "+");
				sumj += j;
				
			} else {
				sumj += j;
				System.out.print(j + "=" +sumj);
				
			}
		}
	}
}
