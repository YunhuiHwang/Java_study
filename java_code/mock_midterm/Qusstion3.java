package org.java_code.mock_midterm;

import java.util.Scanner;

public class Qusstion3 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		Scanner scn=new Scanner(System.in);
		while(true) {
			char a= scn.next().charAt(0);
			if((int)a<(int)'a'||(int)a>(int)'z') break;
		}
		System.out.println("Á¾·á ");
	}

}
