package org.java_code.temp;

public class Student_mock extends Human{
	
	String std_no;
	
	public Student_mock (String n, int a, int w, String no) {
		super(n, a, w);
		this.std_no=no;
	}
	
	public Student_mock() {
		//super(); �̰͵� ���°� ����
		//->�ʱ�ȭ �϶�� �ߴµ� ���⼭�� ���� �� �Ǵϱ� �׳� ȣ���ؼ�
		this.std_no = "60200000";
	}
	
	public void study(int h) {
		System.out.println(show_name()+"���� "+h+"�ð����� �����߽��ϴ�.");
	}//private �� �ٷ� ������ �� �����ϱ� �Ʊ� ������ �޼ҵ���
	//show_name()�޼ҵ�� �̸� �������� ��!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//super.show_name() ���°� ����

	public static void main(String[] args) {
		Student_mock s1 = new Student_mock ("ȫ�浿", 20, 88, "60191234");
		Student_mock s2 = new Student_mock ();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}

}	