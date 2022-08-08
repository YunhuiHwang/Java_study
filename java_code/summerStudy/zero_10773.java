package org.java_code.summerStudy;

import java.util.Scanner;
import java.util.Stack;

public class zero_10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt(), sum = 0;
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < K; i++) {
			int n = sc.nextInt();
			if (n != 0) {
				sum += st.push(n);
			}
			else {
				sum -= st.pop();
			}	
		}
		System.out.println(sum);
	}
}

/*
 for (int i = 0; i < st.size(); i++) {
	sum -= st.pop();
}
이렇게 된다면 pop하면 stack의 size가 계속해서 바뀌기 때문에
st.size() 이렇게 바로 넣지 말고 이 값을 
int range=st.size();
이런식으로 변수에 넣은 가음에 이걸 st.size() 대신 써주면 된다.
 */
