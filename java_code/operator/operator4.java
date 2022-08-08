package org.java_code.operator;

public class operator4 {

	public static void main(String[] args) {
		String a="aaa";
		String b=a;
		String c=new String("aaa");
		
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("c "+c);
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));
		//b에는 a를 넣은 거니까 주소가 같아서 같은 거라 나오고
		//c는 새롭게 값 넣은 거라 a,b랑은 주소가 달라서 다른 거라 나옴
		//근데 equals쓰면 두 값을 비교해서 같다고 나오는 거임! 
		//결론! 그래서 문자열 비교할 때는 equals 써야함
		
		
	}

}
