package org.java_code.practice_midterm;

public class P11_Switch {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		int value = 1;

		switch (value) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("그 외의 수");
		}
/*
 여기에서 break 다 지우면 1 2 3 그외의 수 다 출력되는데
 그 이유가 여기서 case는 실행이 될 조건을 찾아주는 것이지,
 한 번 찾고 나면 그 이후에도 조건에 맞나 살피지 않기 때문
 (그니까 1 맞아서 1밑에 있는 실행문들을 다 실행하는 것)
 */
	}

}
