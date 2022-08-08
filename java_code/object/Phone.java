package org.java_code.object;

public class Phone {

	String number;
	int battery;
	Boolean battery_is_full;

	public void show_phone_number() {
		System.out.println("��ȣ�� " + number + "�Դϴ�.");
	}

	public void charge(int h) {
		battery += (h * 10);
		if (battery >= 100)
			battery = 100;
	}

	public void recharge() {
		if(battery_is_full)
			System.out.println("�̹� ���͸��� �����Ǿ� �ֽ��ϴ�.");
		else {
			System.out.println("�������Դϴ�.");
			battery_is_full=true;
		}
	}
	public void show_battery() {
		System.out.println(battery);
	}

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Phone p = new Phone();
		p.number = "010-0000-0000";
		p.battery_is_full = false;
		p.battery = 86;
		p.show_phone_number();
		p.charge(2);
		p.show_battery();
		p.recharge();
	}

}
