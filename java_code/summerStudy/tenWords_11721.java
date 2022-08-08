package org.java_code.summerStudy;

import java.util.Scanner;

public class tenWords_11721 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word =scn.next();
		int n=(word.length())/10+1;
		//이거 그냥 word/10이렇게 해도 된대
		for (int i=0; i<n; i++) {
			System.out.println(word.substring(10*i,10*(i+10)));
		}
		//이거 다음에 넘어가지 않게 하려면 숫자 하나만 쓰면 그 숫자부터 끝까지 출력된대
	}

}
