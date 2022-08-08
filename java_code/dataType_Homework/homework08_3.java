package org.java_code.dataType_Homework;

public class homework08_3 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		for (int i = 0; i < 5; ++i) {
			int a = (int) (Math.random() * 5 + 1);
			for (int j = 0; j < a; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
