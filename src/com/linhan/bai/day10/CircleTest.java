package com.linhan.bai.day10;

public class CircleTest {
	
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.3);
		Circle circle2 = new Circle(3.3,"white",2.0);
		
		System.out.println("Circle1��Circle2����ɫ�Ƿ���ͬ��"+circle1.getColor().equals(circle2.getColor()));
		System.out.println("Circle1��Circle2�İ뾶�Ƿ���ȣ�"+circle1.equals(circle2));
		System.out.println(circle1.toString());
		System.out.println(circle2);
		
	}

}
