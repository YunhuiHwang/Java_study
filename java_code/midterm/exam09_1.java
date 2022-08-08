package org.java_code.midterm;

import java.util.Scanner;

public class exam09_1 {

	public static void main(String[] args) {
		System.out.println("9번 60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		System.out.println("가위바위보 중 하나를 고르시오.( 1.가위, 2.바위, 3.보)");
		int me =scn.nextInt();
		int com = (int) (Math.random() * 3 + 1);
		System.out.println("나: " + str[me-1]);
		System.out.println("컴퓨터: " +str[com-1]);
		
		if (me==com) {
			System.out.println("무승부");
		}
		else if((me==1&&com==3)||(me==2&&com==1)|| (me==3&&com==2))
			System.out.println("나 승");
		else
			System.out.println("컴퓨터 승");
		
	}

}
