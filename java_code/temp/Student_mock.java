package org.java_code.temp;

public class Student_mock extends Human{
	
	String std_no;
	
	public Student_mock (String n, int a, int w, String no) {
		super(n, a, w);
		this.std_no=no;
	}
	
	public Student_mock() {
		//super(); 이것도 쓰는게 좋음
		//->초기화 하라고 했는데 여기서는 변경 안 되니까 그냥 호출해서
		this.std_no = "60200000";
	}
	
	public void study(int h) {
		System.out.println(show_name()+"님이 "+h+"시간동안 공부했습니다.");
	}//private 을 바로 가져올 수 없으니까 아까 만들어둔 메소드인
	//show_name()메소드로 이름 가져오면 됨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//super.show_name() 쓰는게 좋음

	public static void main(String[] args) {
		Student_mock s1 = new Student_mock ("홍길동", 20, 88, "60191234");
		Student_mock s2 = new Student_mock ();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}

}	