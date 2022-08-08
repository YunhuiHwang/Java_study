package org.java_code.dataType;

public class DataType04 {

	public static void main(String[] args) {
		int a=3;
		a=a+1;  
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		//여기서 2 증가된게 아니라 앞줄에서 1+1 뒷줄에서 +1 된거임
		/*
		 ++a랑 같은 거
		 a++로도 쓸 수  있는데 차이 생길 수 있음
		 System.out.println(++a); 이건 a=a+1 한 걸 출력
		 System.out.println(a++); 이건 a 출력 후 a에 a+1 저장
		 */
		double d;
		int b;
		d=3.5;
		b=(int)d;
		System.out.println(b);
		//실수 정수에 넣으면 정수부분만 나온다.
	}

}

