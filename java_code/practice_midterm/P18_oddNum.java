package org.java_code.practice_midterm;

public class P18_oddNum {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		int i = 0;
		while (i < 20) {
			if (i % 2 != 0) {
				System.out.println(i);
				++i;
			} else
				++i;
		}
		
/*
 홀수는 2씩 증가하니까 while 쓸 때 
 		int i = 1;
		while (i < 20) {
			System.out.println(i);
			i+=2
			}
	이렇게 하면 더 간결하게 홀수만 출력할 수 있음
 */
		
		for(int j=0; j<20; ++j) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
/*
얘도 마찬가지로 
	for (int j=1; j<20; j+=2) {
		System.out.println(j);
	}
	이렇게 하면 더 간단합니다.
 */
	}

}
