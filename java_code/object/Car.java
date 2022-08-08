package org.java_code.object;

public class Car {
	
	String color; int speed;
	
	String get_color() {
		return color;
	}
	int get_speed() {
		return speed;
	}
	void speed_up(int v){
		speed+=v;
		if(speed>200) speed=200;
	}
	void speed_down(int v){
		speed-=v;
		if(speed<0) speed=0;
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.color = "빨강";
		c1.speed = 0;
		
		System.out.println("차량 색상은 "+c1.get_color());
		
		c1.speed_up(100);
		System.out.println("차량 속도는 "+c1.get_speed());
		c1.speed_up(150);
		System.out.println("차량 속도는 "+c1.get_speed());
		c1.speed_down(300);
		System.out.println("차량 속도는 "+c1.get_speed());
	}

}
