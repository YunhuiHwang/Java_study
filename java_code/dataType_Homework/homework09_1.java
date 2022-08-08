package org.java_code.dataType_Homework;

import java.util.Scanner;

public class homework09_1 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn = new Scanner(System.in);
		
		char[] name = {'Y', 'u', 'n', 'h', 'e', 'e'};
		System.out.print("¸î ¹øÂ° ¾ËÆÄºªÀ» ÇÁ¸°Æ®ÇÒ±î¿ä? ");
		int num=scn.nextInt();
		
		if(num-1<name.length)
			System.out.println(name[(num-1)]);
		else 
			System.out.println("¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");

	}

}
