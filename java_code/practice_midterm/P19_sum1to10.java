package org.java_code.practice_midterm;

public class P19_sum1to10 {

	public static void main(String[] args) {
		System.out.println("60201393 È²À±Èñ");
		int i = 1, sumi=0, sumj=0;
		while (i <=10) {
				System.out.println(i);
				sumi+=i; ++i; 
		}System.out.println(sumi);
		
		for(int j=1; j<=10; ++j) {
			System.out.println(j);
			sumj+=j; 
		}System.out.println(sumj);
	}

}
