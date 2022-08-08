package org.java_code.object;

public class game {

	String name;
	private int cookie_level, pet_level, cookie_point, pet_point;

	public game() {
		this.cookie_level = 0;
		this.pet_level = 0;
		this.cookie_point = 0;
		this.pet_point = 0;
	}//기본 생성자
	
	public game(int cl, int pl, int cp, int pp) {
		this.cookie_level=cl;
		this.pet_level=pl;
		this.cookie_point=cp;
		this.pet_point=pp;
	}//추가 생성자

	public void show_character_info() {
		System.out.println("이름: " + name);
		System.out.println("쿠키 레벨: " + cookie_level);
		System.out.println("쿠키 포인트: " + cookie_point);
		System.out.println("펫 레벨: " + pet_level);
		System.out.println("펫 포인트: " + pet_point);
	}// 캐릭터 정보를 보여주는 메소드

	public void cookie_level_up(int n) {
		cookie_point += n;
		if (cookie_point >= 30) {
			cookie_level += 1;
			System.out.println("cookie level up");
			if (cookie_level >= 30)
				System.out.println("쿠키 최대 레벨");
			else {
				cookie_point -= 30;
				System.out.println("다음 쿠키 레벨 업까지 남은 포인트 " + (30 - pet_point));
			}
		} else
			System.out.println("쿠키 레벨업까지 남은 포인트 " + (30 - cookie_point));
	}// 쿠키 레벨업 관련 메소드(30포인트->레벨업, 최대 레벨 30)

	public void pet_level_up(int n) {
		pet_point += n;
		if (pet_point + n >= 30) {
			pet_level += 1;
			System.out.println("pet level up");
			if (pet_level >= 30)
				System.out.println("pet 최대 레벨");
			else {
				pet_point -= 30;
				System.out.println("다음 펫 레벨 업까지 남은 포인트 " + (30 - pet_point));
			}
		} else
			System.out.println("펫 레벨 업까지 남은 포인트 " + (30 - pet_point));
	}// 펫 레벨업 관련 메소드(30포인트->레벨업, 최대 레벨 30)

	public static void main(String[] args) {
		System.out.println("60201393 황윤희");
		game g = new game(29, 23, 24, 12);
		g.show_character_info();
		g.cookie_level_up(5);
		g.pet_level_up(10);
		g.cookie_level_up(10);
		g.pet_level_up(10);
	}
}
/*
 * 쿠키런을 생각하며 만든 클래스이다. 쿠키와 펫 레벨 정보, 레벨업까지 필요한 정보를 보여주고, 한 판을 플레이 하면 쿠키, 펫 레벨업
 * 과정이 이루어진다.
 */
