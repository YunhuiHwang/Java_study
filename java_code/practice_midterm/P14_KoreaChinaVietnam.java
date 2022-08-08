package org.java_code.practice_midterm;

import java.util.Scanner;

public class P14_KoreaChinaVietnam {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);

		String country = scn.next();

		switch (country) {
		case "Korea", "korea":
			System.out.println("대한민국");
		    break;
		case "China", "china":
			System.out.println("중국");
			break;
		case "Vietnam", "vietnam":
			System.out.println("베트남");
			break;
		default:
			System.out.println("해당없음");
			break;
		}

	}

}
