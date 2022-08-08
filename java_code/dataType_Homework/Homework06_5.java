package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework06_5 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		int quiz = (int)(Math.random()*10+1);
		System.out.println("숫자맞추기 시작!(1~10)");
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int answer=scn.nextInt();
			if (answer>quiz) {
				System.out.println("정답보다 큽니다.");
			}
			else if (answer==quiz) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("정답보다 작습니다.");
			}
		}
	}
}
