package com.linhan.bai.day02;

public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(5);
		System.out.println("年龄为："+person.getAge());
		Animals animals = new Animals("Dog");
		System.out.println("Name: "+animals.name);
	}
}
class Animals{
	String name;
	int age;
	
	//构造器，用来造对象
	public Animals(String name) {
		this.name = name;
		System.out.println("This is a "+name);
	}
	
	public String getName() {
		return name;
	}
	
}