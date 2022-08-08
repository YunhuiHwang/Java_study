package org.java_code.operator;

public class operator2 {

	public static void main(String[] args) {
		double a,b;
		a=Math.random();
		b=Math.random();
		System.out.println("첫번째수: "+a);
		System.out.println("두번째수: "+b);
		
		System.out.println("첫번째 수가 두번째수보다 큰 것은"+(a>b));
		
		a=Math.round(a);
		//a를 소수점 첫째자리에서 반올림
		System.out.println("첫번째수: "+a);
		b=(double)(Math.round(b*10))/10;
		//소수점 둘째자리에서 되게 하고 싶으면! 이런식으로 10, 100, 1000 등 곱하거나 나눠서 조절
		//앞에 (double) 안 쓰면 0.0 나온다.
		System.out.println("두번째수: "+b);
		System.out.println("첫번째 수가 두번째 수보다 큰 것은 "+(a>b));

	}

}
