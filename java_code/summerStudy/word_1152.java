package org.java_code.summerStudy;

import java.util.Scanner;

public class word_1152 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        sc.close();
        if(s.equals(" ")) System.out.println(0);
        //이 부분이 없으면 공백만 입력 시 1 나와서 틀리게 됨
        else System.out.println(s.trim().split(" ").length);
	}
}