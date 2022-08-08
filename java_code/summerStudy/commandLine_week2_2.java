package org.java_code.summerStudy;

public class commandLine_week2_2 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수"+ args.length);
		for(int i=0; i<args.length;i++) {
			System.out.println("args["+i+"]=\""+ args[i]+"\"");
		}
	}
}