package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework04_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("60201393 황윤희");
		String str=scn.nextLine();
		
		switch (str) {
			case "Korea":
			case "korea":
				str="대한민국";
				break;
			case "China":
			case "china":
				str="중국";
				break;
			case "Vietnam":
			case "vietnam":
				str="베트남";
				break;
			default:
				str="해당없음";
		}
		System.out.println(str);
	}

}
