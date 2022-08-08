package org.java_code.condition;

import java.util.Scanner;

public class IF03 {
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("가장 큰 수는 "+a);
		}
		else if (b>c) {
			System.out.println("가장 큰 수는 "+b);
		}
		else {
			System.out.println("가장 큰 수는 "+c);
		}
		//반복이 너무 많아서 보기 싫으니까 max같은 거 정의해서 값 넣고 조건식 다 끝난 후 max 출력해도 됨
		
	}

}
