package org.java_code.object;

public class AnimalHospital {

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		//Animal ��ӹ޴� Animal_treatment ����
		Animal_treatment at = new Animal_treatment("����", "������", "�ε巯��", "�˷����⼺����",3 , 10.5, false, true);
		at.animal_info();
		at.get_drug();
		at.treatment_fee();
		
		System.out.println();
		
		//Animal ��ӹ޴� Animal_operation ����
		Animal_operation ao = new Animal_operation("ġ��", "�����", "�ٸ� ����", "���� �մٸ� ����", 8, 8.6, "2022�� 6�� 4��", 5);
		ao.animal_info();
		ao.operation_info();
		ao.operation_fee();
	}
}
