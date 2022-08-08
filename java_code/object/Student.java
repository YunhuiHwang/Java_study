package org.java_code.object;

public class Student {
	int score_Kor;
	int score_Eng;
	
	int sum() {
		return score_Kor+score_Eng;
		
	}
	
	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2 =new Student();
		
		s1.score_Eng = 100;
		s1.score_Kor = 98;
		System.out.println(s1.sum());

	}


}
