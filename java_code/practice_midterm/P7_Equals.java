package org.java_code.practice_midterm;

public class P7_Equals {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		String a="aaa";
		String b= a;
		String c=new String("aaa");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));
	}

}

/*
 b에 a를 넣은 것이기 때문에 a와 b는 ==썼을 때 같은 것으로 
 나오지만 c는 새롭게 "aaa" 생성한 거라 ==로 비교하면 다르다
 나옴. 문자열로 비교하고 싶으면 .equals() 쓰면 됨
 그러면 문자열의 모양이 같은지 비교하기 때문에 같은 거라 나옴
*/