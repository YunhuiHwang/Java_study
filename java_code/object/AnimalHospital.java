package org.java_code.object;

public class AnimalHospital {

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		//Animal 상속받는 Animal_treatment 생성
		Animal_treatment at = new Animal_treatment("보미", "강아지", "두드러기", "알레르기성염증",3 , 10.5, false, true);
		at.animal_info();
		at.get_drug();
		at.treatment_fee();
		
		System.out.println();
		
		//Animal 상속받는 Animal_operation 생성
		Animal_operation ao = new Animal_operation("치즈", "고양이", "다리 절음", "왼쪽 앞다리 골절", 8, 8.6, "2022년 6월 4일", 5);
		ao.animal_info();
		ao.operation_info();
		ao.operation_fee();
	}
}
