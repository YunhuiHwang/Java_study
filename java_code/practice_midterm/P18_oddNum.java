package org.java_code.practice_midterm;

public class P18_oddNum {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		int i = 0;
		while (i < 20) {
			if (i % 2 != 0) {
				System.out.println(i);
				++i;
			} else
				++i;
		}
		
/*
 Ȧ���� 2�� �����ϴϱ� while �� �� 
 		int i = 1;
		while (i < 20) {
			System.out.println(i);
			i+=2
			}
	�̷��� �ϸ� �� �����ϰ� Ȧ���� ����� �� ����
 */
		
		for(int j=0; j<20; ++j) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}
/*
�굵 ���������� 
	for (int j=1; j<20; j+=2) {
		System.out.println(j);
	}
	�̷��� �ϸ� �� �����մϴ�.
 */
	}

}
