package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework04_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("60201393 황윤희");
		System.out.println("실행결과");
		System.out.print("나: ");
		char me=scn.nextLine().charAt(0); //char로 문자 입력받기
		char computer=(char)(Math.random()*26+65);
		//알파벳 개수만큼 랜덤되게 한 후 아스키코드 A(시작)인 65 더하기 
		System.out.println("컴퓨터: "+computer);
		if (me>computer) System.out.println(me+"   "+computer);
		else System.out.println(me+"   "+computer);

	}

}
