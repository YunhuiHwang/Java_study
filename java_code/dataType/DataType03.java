 package org.java_code.dataType;

public class DataType03 {

	public static void main(String[] args) {
		
		boolean a;
		a= 3>1;
		System.out.println(a);
		
		int b=2, c=3;
		System.out.println(b==2 &&c==3);
		
		boolean d=3==3;
		System.out.println(d);
		
		System.out.println(4!=5);
		//�ٷ� �� �־ true false �Ǻ�����
		
		int e=2, f=3;
		System.out.println(e==2&&f==1);
		
		float g;
		g= 0.001f+0.001f;
		System.out.println(g);
		
		float h;
		h= 0.001f+0.001f+0.0001f;
		System.out.println(h);
		//float�� ��쿡�� �Ҽ��� ��� �߸��Ǵ� ��쵵 ����(����Ȯ)
	}

}

// a=3=3; �̷��� ���� �ȵ� a= 3==3; �̷��� ��ߵ�
// and �� &&�� ��ȣ �� �� �Ἥ ǥ�� ����