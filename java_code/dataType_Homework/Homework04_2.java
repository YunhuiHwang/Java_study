package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework04_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		String str=scn.nextLine();
		
		switch (str) {
			case "Korea":
			case "korea":
				str="���ѹα�";
				break;
			case "China":
			case "china":
				str="�߱�";
				break;
			case "Vietnam":
			case "vietnam":
				str="��Ʈ��";
				break;
			default:
				str="�ش����";
		}
		System.out.println(str);
	}

}
