package org.java_code.array;

public class Array1 {

	public static void main(String[] args) {
		int[ ] array1 = new int [4];
		
		for (int i = 0; i < 4; ++i) {
			array1[i] = i+1;
		}
		
		for (int i=0; i<4; ++i) {
			System.out.println(array1[i]);
		}
		/*�׳� �ΰ� �� ���� for���� �־ ��
		 for (int i = 0; i < 4; ++i) {
			array1[i] = i+1;
		 	System.out.println(array1[i]);
		}
		 
		 */

	}

}
