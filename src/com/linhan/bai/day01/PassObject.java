package com.linhan.bai.day01;

public class PassObject {
	
	public static void main(String[] args) {
		PassObject pass = new PassObject();
		Circle c = new Circle();
		pass.printAreas(c, 5);
	}
	
	public void printAreas(Circle c,int time) {
		for (int i = 1; i <= time; i++) {
			c.radius = i;
			System.out.print(i+"\t");
			System.out.println(c.findArea());
		}
	}

}
