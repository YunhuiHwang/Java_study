package org.java_code.final_mock;

public class f_Bird extends f_Animal{
	
	private int size;
	
	public f_Bird(int s, int w) {
		super(w);
		size=s;
	}
	public f_Bird() {
		
	}
	public void twitter() {
		System.out.println("�����Ҵϴ�.");
	}
	public int get_size() {
		return size;
	}

	public static void main(String[] args) {
		f_Bird b01 = new f_Bird();
		b01.move();
		b01.twitter();
		
		f_Bird b02 = new f_Bird(160, 90);
		System.out.println("������� "+ b02.get_size()+"�Դϴ�.");
		System.out.println("���Դ� "+ b02.get_weight()+"�Դϴ�.");
	}

}
