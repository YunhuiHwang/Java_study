package org.java_code.method;

import java.util.Arrays;
import java.util.Scanner;

public class method05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char alp = scn.next().charAt(0);
		
		System.out.println(ascii(alp));
	}

	public static int ascii(char a) {
		return (int)a;
		}

	}

/*

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char alp = scn.next().charAt(0);
		
		ascii(alp);
	}

	public static int ascii(char a) {
		System.out.println((int)a);
		}
		
아예 이렇게 함수에 프린트 넣어서 만들 수도 있음

 */


