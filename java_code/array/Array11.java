package org.java_code.array;

public class Array11 {

	public static void main(String[] args) {
		int [] arr= {10, 20, 30, 40, 50};
		int sum=0; double avg=0;
		
		for (int i=0; i<5; ++i) {
			sum+=arr[i];
		}
		avg=sum/5;
		//avg=(double)sum/arr.length; �ص� �ȴ�.
		//avg=(double)(sum/arr.length); �̷��Դ� �� ��
		//�� �� �ϳ����� �ٿ��� �ؼ� ���� �� �� �Ǵ� ����
		//for�������� 5 ���� arr.length���°� �� ����
		
		System.out.println("������ ��: " +sum);
		System.out.println("���: " +avg);
	}

}