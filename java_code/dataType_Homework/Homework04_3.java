package org.java_code.dataType_Homework;

import java.util.Scanner;

public class Homework04_3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("60201393 Ȳ����");
		System.out.println("������");
		System.out.print("��: ");
		char me=scn.nextLine().charAt(0); //char�� ���� �Է¹ޱ�
		char computer=(char)(Math.random()*26+65);
		//���ĺ� ������ŭ �����ǰ� �� �� �ƽ�Ű�ڵ� A(����)�� 65 ���ϱ� 
		System.out.println("��ǻ��: "+computer);
		if (me>computer) System.out.println(me+"   "+computer);
		else System.out.println(me+"   "+computer);

	}

}
