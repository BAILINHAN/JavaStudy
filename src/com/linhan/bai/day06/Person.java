package com.linhan.bai.day06;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void walk(int distance) {
		System.out.println("����"+distance+"����");
		show();
		eat();
	}
	
	private void show() {
		System.out.println("����һ����");
	}
	
	public Object info() {
		return null;
	}
	
}
