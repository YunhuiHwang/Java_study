package org.java_code.object;

public class game {

	String name;
	private int cookie_level, pet_level, cookie_point, pet_point;

	public game() {
		this.cookie_level = 0;
		this.pet_level = 0;
		this.cookie_point = 0;
		this.pet_point = 0;
	}//�⺻ ������
	
	public game(int cl, int pl, int cp, int pp) {
		this.cookie_level=cl;
		this.pet_level=pl;
		this.cookie_point=cp;
		this.pet_point=pp;
	}//�߰� ������

	public void show_character_info() {
		System.out.println("�̸�: " + name);
		System.out.println("��Ű ����: " + cookie_level);
		System.out.println("��Ű ����Ʈ: " + cookie_point);
		System.out.println("�� ����: " + pet_level);
		System.out.println("�� ����Ʈ: " + pet_point);
	}// ĳ���� ������ �����ִ� �޼ҵ�

	public void cookie_level_up(int n) {
		cookie_point += n;
		if (cookie_point >= 30) {
			cookie_level += 1;
			System.out.println("cookie level up");
			if (cookie_level >= 30)
				System.out.println("��Ű �ִ� ����");
			else {
				cookie_point -= 30;
				System.out.println("���� ��Ű ���� ������ ���� ����Ʈ " + (30 - pet_point));
			}
		} else
			System.out.println("��Ű ���������� ���� ����Ʈ " + (30 - cookie_point));
	}// ��Ű ������ ���� �޼ҵ�(30����Ʈ->������, �ִ� ���� 30)

	public void pet_level_up(int n) {
		pet_point += n;
		if (pet_point + n >= 30) {
			pet_level += 1;
			System.out.println("pet level up");
			if (pet_level >= 30)
				System.out.println("pet �ִ� ����");
			else {
				pet_point -= 30;
				System.out.println("���� �� ���� ������ ���� ����Ʈ " + (30 - pet_point));
			}
		} else
			System.out.println("�� ���� ������ ���� ����Ʈ " + (30 - pet_point));
	}// �� ������ ���� �޼ҵ�(30����Ʈ->������, �ִ� ���� 30)

	public static void main(String[] args) {
		System.out.println("60201393 Ȳ����");
		game g = new game(29, 23, 24, 12);
		g.show_character_info();
		g.cookie_level_up(5);
		g.pet_level_up(10);
		g.cookie_level_up(10);
		g.pet_level_up(10);
	}
}
/*
 * ��Ű���� �����ϸ� ���� Ŭ�����̴�. ��Ű�� �� ���� ����, ���������� �ʿ��� ������ �����ְ�, �� ���� �÷��� �ϸ� ��Ű, �� ������
 * ������ �̷������.
 */
