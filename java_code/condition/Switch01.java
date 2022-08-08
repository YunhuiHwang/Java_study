package org.java_code.condition;

public class Switch01 {

	public static void main(String[] args) {
		int value=1;
		
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
		//여기서 break; 안 하면 case1,2,3 default까지 다 출력됨
		
		String fruit ="사과";
		
		switch (fruit) {
		case "사과":
			System.out.println("맛나");
			break;
		case "딸기":
			
			System.out.println("맛나");
			break;
		case "귤":
			System.out.println("보통");
			break;
		default:
			System.out.println("별로");
		
		}
		//이런 식으로 문자도 쌉가능
		//이 경우에는 사과랑 딸기 출력값 같으니까 사과 밑에 두 줄 지워도 결과 같음
		//break되기 전까지는 계속 되니까
		
	}
		
}
