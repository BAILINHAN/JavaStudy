package com.linhan.bai.day08;

public class InstanceTest {

	public static void main(String[] args) {
		InstanceTest instanceTest = new InstanceTest();
		instanceTest.method(new Student());

	}

	public void method(Person e) {
		String info = e.getInfo();
		System.out.println(info);
		if (e instanceof Graduate) {
			System.out.println("a graduate");
		} 
		if (e instanceof Student) {
			System.out.println("a studnet");
		} 
		if (e instanceof Person) {
			System.out.println("a person");
		}
	}

}

class Person {
	protected String name = "person";
	protected int age = 50;

	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age;
	}

}

class Student extends Person {
	protected String school = "pku";

	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age + "\n" + "school: " + school;
	}

}

class Graduate extends Student {
	protected String major = "IT";

	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age + "\n" + "school: " + school + " major: " + major;
	}

}
