package org.java_code.practice_midterm;
import java.util.Scanner;

public class P15_fromAtoZ {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("실행결과");
		System.out.print("나: " );
		
		char me = scn.next().charAt(0);
		char computer = (char)(Math.random()*26+(int)'A');
		
		System.out.println("컴퓨터: "+computer);
		
		if (me< computer) System.out.println(me+" " +computer);
		else System.out.println(computer+" "+me);
		
	}

}

