package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_4 {

		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			
			char[] array = { 'a', 'b', 'c', 'd' };
		
			System.out.println("n?");
			int n = scn.nextInt();
			
			/*
			 try {
			 	System.out.println(array[n-1]);
			 }catch (ArrayIndexOutOfBoundsException e){
			 	System.out.println("오류 발생");
			 }
			 */
			
			if(n<=array.length)
				System.out.println(array[n-1]);
			else
				System.out.println("오류 발생");

	}

}
