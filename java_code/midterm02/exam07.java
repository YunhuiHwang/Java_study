package org.java_code.midterm02;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		System.out.println("7�� 60201393 Ȳ����");
		Scanner scn = new Scanner(System.in);
			int[][] arr = new int[3][3];
			int max=0;

			for (int i = 0; i<arr.length; ++i) {
				System.out.println((i+1)+"��° �л��� ������?");
				for (int j = 0; j <arr[i].length; ++j) {
					arr[i][j] = scn.nextInt();
					if(arr[i][j]> max) max=arr[i][j];
				}
			}

			System.out.println("�ְ�����"+max);
		}
	}

