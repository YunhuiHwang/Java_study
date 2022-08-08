package org.java_code.summerStudy;

import java.util.Scanner;

public class sugarDelivery_2839 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int count = 0;

		if (N == 4 || N == 7)
			count = -1;
		else if (N % 5 == 0)
			count = N / 5;
		else if (N % 5 == 1 || N % 5 == 3)
			count = N / 5 + 1;
		else if (N % 5 == 2 || N % 5 == 4)
			count = N / 5 + 2;

		System.out.print(count);
	}
}
/*
 이거 5kg으로 나누어 떨어지는 거 출력한 다음에 이거 안 되면 3씩 빼고 나누고 
 3 뺐는데 그게 0 이하면 그거 -1출력하는 방법도 있음
  
*/