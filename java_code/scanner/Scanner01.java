package org.java_code.scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
				
				int i=scn.nextInt();
				double d=scn.nextDouble();
				String s=scn.nextLine();
				
				System.out.println("int: "+i);
				System.out.println("double: "+d);
				System.out.println("string: "+s);

	}

}
