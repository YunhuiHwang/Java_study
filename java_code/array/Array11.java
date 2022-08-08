package org.java_code.array;

public class Array11 {

	public static void main(String[] args) {
		int [] arr= {10, 20, 30, 40, 50};
		int sum=0; double avg=0;
		
		for (int i=0; i<5; ++i) {
			sum+=arr[i];
		}
		avg=sum/5;
		//avg=(double)sum/arr.length; 해도 된다.
		//avg=(double)(sum/arr.length); 이렇게는 안 됨
		//둘 중 하나에만 붙여야 해서 위에 거 안 되는 거임
		//for문에서도 5 말고 arr.length쓰는게 더 좋음
		
		System.out.println("원소의 합: " +sum);
		System.out.println("평균: " +avg);
	}

}