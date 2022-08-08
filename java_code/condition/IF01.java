package org.java_code.condition;

public class IF01 {

	public static void main(String[] args) {
		double n=Math.random();
		
		if(n>=0.5) {
			System.out.println("0.5이상");
		}
		
		if(n<0.5) {
			System.out.println("0.5미만");
		}

		//중괄호 써야 하는 거 같지만 조건문 한 줄이면 안 써도 됨
		//if(n>=0.5) System.out.println("0.5이상"); 이렇게 써도 됨
		
		double m=Math.random();
		
		if(m>=0.5) {
			System.out.println("0.5이상");
		}
		else {
			System.out.println("0.5미만");
		}
		//이렇게 조건이 배타적이라면 if{} else{} 이렇게 쓸 수 있음
		
	}

}
