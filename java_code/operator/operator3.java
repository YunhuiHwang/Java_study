package org.java_code.operator;

public class operator3 {

	public static void main(String[] args) {
		char a;
		a='A';
		System.out.println(a);
		System.out.println((int)a);
		//그냥 출력하면 문자로 나오고, 정수로 출력하면 아스키코드 값 나옴
		
		double b, c;
		b=Math.random();
		c=Math.random();
		System.out.println(b);
		System.out.println(c);
		System.out.println("첫번째 수가 두번째 수보다 큰 것은 "+(b>c));
		
	char c1='a', c2='z';
	System.out.println((int)c1);
	System.out.println((int)c2);
	System.out.println("a가 z보다 앞선 것은"+(c1<c2));
	

	}

}
