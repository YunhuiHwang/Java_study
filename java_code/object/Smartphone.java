package org.java_code.object;

public class Smartphone {
	String number, telecommunication;
	int battery, memory, sound;

	void show_phone_information() {
		System.out.println("번호는 " + number + "입니다.");
		System.out.println("통신사는 " + telecommunication + "입니다.");
		System.out.println("배터리는 " + battery + "입니다.");
		System.out.println("메모리는 " + memory + "입니다.");
	}

	void recharge(double time) {
		battery += (time * 30);
		if (battery >= 100)
			System.out.println("배터리가 100%입니다.");
		else
			System.out.println("충전중입니다. 현재 배터리는 " + battery);
	}

	void change_telecommunication(String change) {
		if (change.equals(telecommunication))
			System.out.println("이미 해당 통신사입니다.");
		else if ((!change.equals("SKT")) && (!change.equals("LGU")) && (!change.equals("KT")))
			System.out.println("에러");
		else
			System.out.println("통신사 " + change + "로 변경완료");
	}

	void photo_shoot(int num) {
		while (true) {
			if (memory >= 5) {
				memory -= 5;
				num--;
				if (num == 0) {
					System.out.println("남은 메모리 " + memory);
					break;
				}
			} else {
				System.out.println("메모리 부족 사진 " +num+"장 저장안됨");
				break;
			}
		}
	}
	
	void photo_delete(int num) {
		memory+=(num*5);
		System.out.println("남은 메모리 " + memory);
		}
	
	void sound_up(int s){
		sound+=s;
		if(sound>50) sound=50;
		System.out.println("현재 소리 크기는 " + sound);
	}
	void sound_down(int s){
		sound-=s;
		if(sound<0) sound=0;
		System.out.println("현재 소리 크기는 " + sound);
	}

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
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
