package org.java_code.object;

public class Smartphone {
	String number, telecommunication;
	int battery, memory, sound;

	void show_phone_information() {
		System.out.println("��ȣ�� " + number + "�Դϴ�.");
		System.out.println("��Ż�� " + telecommunication + "�Դϴ�.");
		System.out.println("���͸��� " + battery + "�Դϴ�.");
		System.out.println("�޸𸮴� " + memory + "�Դϴ�.");
	}

	void recharge(double time) {
		battery += (time * 30);
		if (battery >= 100)
			System.out.println("���͸��� 100%�Դϴ�.");
		else
			System.out.println("�������Դϴ�. ���� ���͸��� " + battery);
	}

	void change_telecommunication(String change) {
		if (change.equals(telecommunication))
			System.out.println("�̹� �ش� ��Ż��Դϴ�.");
		else if ((!change.equals("SKT")) && (!change.equals("LGU")) && (!change.equals("KT")))
			System.out.println("����");
		else
			System.out.println("��Ż� " + change + "�� ����Ϸ�");
	}

	void photo_shoot(int num) {
		while (true) {
			if (memory >= 5) {
				memory -= 5;
				num--;
				if (num == 0) {
					System.out.println("���� �޸� " + memory);
					break;
				}
			} else {
				System.out.println("�޸� ���� ���� " +num+"�� ����ȵ�");
				break;
			}
		}
	}
	
	void photo_delete(int num) {
		memory+=(num*5);
		System.out.println("���� �޸� " + memory);
		}
	
	void sound_up(int s){
		sound+=s;
		if(sound>50) sound=50;
		System.out.println("���� �Ҹ� ũ��� " + sound);
	}
	void sound_down(int s){
		sound-=s;
		if(sound<0) sound=0;
		System.out.println("���� �Ҹ� ũ��� " + sound);
	}

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		Smartphone sp = new Smartphone();
		sp.number = "010-0000-0000";
		sp.telecommunication = "LGU";
		sp.battery = 24;
		sp.memory = 20;
		sp.sound = 10;
		sp.show_phone_information();
		sp.recharge(2);
		sp.change_telecommunication("SKT");
		sp.photo_shoot(6);
		sp.photo_delete(4);
		sp.sound_up(20);
	}

}
