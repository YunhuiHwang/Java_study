package org.java_code.final_mock;

public class f_Dog {

	private String name, color, phone;
	private char sex;

	public f_Dog(String n, char s, String c, String p) {
		name = n;
		sex = s;
		color = c;
		phone = p;
	}
	public f_Dog() {
		name = "멍멍이";
		sex = 'm';
		color = "흰색";
		phone = "000-0000-0000";
	}
	public void show_info() {
		String s;
		if(sex=='m') s= "수컷";
		else s="암컷";
		System.out.println("이름: " + name + " 성별: " + sex + " 색상: " + color + " 주인 핸드폰: "+phone);
	}
	
	public String show_name() {
		return name;
	}
	public void change_phone(String p) {
		phone=p;
	}

	public static void main(String[] args) {
		f_Dog d01 = new f_Dog("하니", 'f', "검은색", "010-1234-5678");
		f_Dog d02 = new f_Dog();
		d01.show_info();
		d02.show_info();
		d01.change_phone("010-2345-2345");
		d01.show_info();
		System.out.println(d02.show_name());
	}

}