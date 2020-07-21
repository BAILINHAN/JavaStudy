package com.linhan.bai.day10;


public class Circle extends GeometricObject{
	
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
		//�����г�ʼ����color��weight
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//��Բ�����
	public double findArea() {
		return 3.14*radius*radius;
	}
	
	//�Ƚ�����Բ�İ뾶�Ƿ����
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}else if(obj instanceof Circle) {
			Circle circle = (Circle) obj;
			return circle.radius == radius;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
