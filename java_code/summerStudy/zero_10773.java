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
�̷��� �ȴٸ� pop�ϸ� stack�� size�� ����ؼ� �ٲ�� ������
st.size() �̷��� �ٷ� ���� ���� �� ���� 
int range=st.size();
�̷������� ������ ���� ������ �̰� st.size() ��� ���ָ� �ȴ�.
 */
