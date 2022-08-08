package org.java_code.mock_midterm;

import java.util.Scanner;

public class mock02_7 {

	public static void main(String[] args) {
		int [][] score = {{70,80,80,0},
				{100, 70, 60, 0},{50, 50, 50, 0},
				{80, 70, 90, 0},{50, 30, 80, 0}};

		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 3; ++j) {
				score[i][3]+=score[i][j];
			}
		}
		
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 4; ++j) {
				System.out.print(score[i][j] + " ");
			}System.out.println();
		}
	}

}
