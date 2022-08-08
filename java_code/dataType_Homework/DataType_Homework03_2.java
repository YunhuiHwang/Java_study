package org.java_code.dataType_Homework;

public class DataType_Homework03_2 {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		
		int a=(int)(Math.random()*10);
/*
 여기에서 괄호 빼고 int a=(int)Math.random()*10; 이렇게 쓰면
 Math.random()에 먼저 int가 걸려서 값이 다 0이된다.
 그러니까 10 곱해도 0이 되는 것....
 */

		System.out.println(a); 
//제대로 할당되었는지 확인하기 위해 프린트해보았습니다.

	}

}
