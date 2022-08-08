package org.java_code.condition;

public class Switch02 {

	public static void main(String[] args) {
		int a=2;
		
		switch(a) {
		case 1:
		case 3:
		case 4:
		case 5:
			System.out.println("오답");
			break;
		case 2:
			System.out.println("정답");
			break;
		}
		
		if (a==2) System.out.println("정답");
		else System.out.println("오답");
		
		
	}

}
