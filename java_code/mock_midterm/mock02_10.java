package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_10 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		int max=100, min=1, com=0, time=0; 
		
		while(true) {
			com=(int)(Math.random()*(max-min)+min);
			System.out.println(com+ "입니까?");
			System.out.println("입력하시오(0:그보다 작다, 1:그보다 크다, 2:맞다)");
			int n=scn.nextInt();
			switch(n) {
			case 0:
				max=com-1;
				time++;
				break;
			case 1:
				min=com+1;
				time++;
				break;
			case 2:
				time++;
				System.out.print("하하하 " +time+ "번만에 맞췄습니다.");
				return;
				
			}
		}

		
	}

}
