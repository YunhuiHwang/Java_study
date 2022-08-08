package org.java_code.summerStudy;

import java.util.Arrays;
import java.util.Scanner;

public class piano_2920 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] order = new int[8];
		int[] ascending = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] disascending = { 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = 0; i < 8; i++) {
			order[i] = scn.nextInt();
		}
		if (Arrays.equals(order, ascending))
			System.out.println("ascending");
		else if (Arrays.equals(order, disascending))
			System.out.println("disascending");
		else
			System.out.println("mixed");
	}
}
//앞에 수가 계속 큰지 작은지 비교해서 풀어도 된대