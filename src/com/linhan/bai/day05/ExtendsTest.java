package com.linhan.bai.day05;

public class ExtendsTest {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		person.setAge(1);
		person.eat();
		
		student.setAge(10);
		student.eat();
		student.sleep();
		System.out.println("student age is:"+student.getAge());
		student.breath();
	}

}
