package com.linhan.bai.day10;


public class Circle extends GeometricObject{
	
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
		//父类中初始化了color和weight
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

	//求圆的面积
	public double findArea() {
		return 3.14*radius*radius;
	}
	
	//比较两个圆的半径是否相等
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
