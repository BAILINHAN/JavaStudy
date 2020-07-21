package com.linhan.bai.day05;

public class Person extends Creature {
	
	String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("�Է�"); 
		sleep();
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
	
	private void speak() {
		System.out.println("����һ����");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
