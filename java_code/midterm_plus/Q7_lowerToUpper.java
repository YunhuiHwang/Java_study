package org.java_code.midterm_plus;

import java.util.Scanner;

public class Q7_lowerToUpper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inputString = " ";

		System.out.println("단어를 입력해주세요");
		inputString = scn.next();
		// 문장이 아니라 단어 받을거니까 그냥 next() 사용

		char[] change = inputString.toCharArray();
		// 문자열을 문자 '배열'로

		for (int i = 0; i < change.length; i++) {
			// 단어 길이만큼 돌린다

			if (change[i] >= 'A' && change[i] <= 'Z') {
				change[i] = (char) (change[i] + 32);
				// 만약 배열에 들어있는 알파벳이 위 조건식에 해당한다면
				// 값에 +32 해주어 소문자로 변환

			} else if (change[i] >= 'a' && change[i] <= 'z') {
				change[i] = (char) (change[i] - 32);
				// 만약 배열에 들어있는 알파벳이 위 조건식에 해당한다면
				// 값에 -32 해주어 대문자로 변환

			} else {
				System.out.println("잘못된 입력");
				// 영어가 아닌 것이 입력되었을 시 출력되는 문장
				break;

			}
		}
		System.out.println(change);
	}
}
