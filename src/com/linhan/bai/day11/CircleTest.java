package com.linhan.bai.day11;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		
		Circle c3 = new Circle(3.4);
		
		System.out.println("c1的id:" + c1.getId());
		System.out.println("c2的id:" + c2.getId());
		System.out.println("c3的id:" + c3.getId());
		System.out.println("共创建了" + Circle.getTotal() + "个圆");
	}
}

class Circle{
	
	private double radius;
	private int id;//自动赋值
	
	public Circle() {
		id = init++;
		total++;
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
		//id = init++;
		//total++;
	}
	
	private static int total;//记录创建圆的个数
	private static int init = 1001;//static声明的属性被所有的对象共享
	
	public double findArea() {
		return 3.14 * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotal() {
		return total;
	}
	
	
}