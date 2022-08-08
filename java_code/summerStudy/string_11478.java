package org.java_code.summerStudy;

import java.util.Scanner;
import java.util.HashSet;

public class string_11478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<S.length(); i++) {
			for(int j=i+1; j<=S.length(); j++) {
				set.add(S.substring(i, j));
			}
		}
		System.out.println(set.size());
	}
}