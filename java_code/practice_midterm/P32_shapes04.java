package org.java_code.practice_midterm;

public class P32_shapes04 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int num = 15;
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.print("       ");
			}
			for (int k = 0; k < 5 - i; ++k) {
				if (num>=10) System.out.print("  "+(num--));
				else System.out.print("    "+(num--));
			}System.out.println();
		}
		
	}
}