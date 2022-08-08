 package org.java_code.dataType;

public class DataType03 {

	public static void main(String[] args) {
		
		boolean a;
		a= 3>1;
		System.out.println(a);
		
		int b=2, c=3;
		System.out.println(b==2 &&c==3);
		
		boolean d=3==3;
		System.out.println(d);
		
		System.out.println(4!=5);
		//바로 식 넣어도 true false 판별해줌
		
		int e=2, f=3;
		System.out.println(e==2&&f==1);
		
		float g;
		g= 0.001f+0.001f;
		System.out.println(g);
		
		float h;
		h= 0.001f+0.001f+0.0001f;
		System.out.println(h);
		//float의 경우에는 소수점 계산 잘못되는 경우도 있음(부정확)
	}

}

// a=3=3; 이렇게 쓰면 안됨 a= 3==3; 이렇게 써야됨
// and 는 &&이 기호 두 개 써서 표현 가능