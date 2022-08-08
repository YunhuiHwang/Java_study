package org.java_code.practice_midterm;

public class P22_whileBreak {
	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		int i =0;
		while (true) {
			++i;
			System.out.println(i);
			if(i==5) break;
		}
		
		int j =0;
		while (true) {
			System.out.println(j++);
			if(j>5) break;

		}
		//j++하면 일단 j 출력 후 j=j+1 되니까...!
		}
}
