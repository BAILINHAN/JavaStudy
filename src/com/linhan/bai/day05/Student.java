package com.linhan.bai.day05;

public class Student extends Person {
	/*
	 * String name; int age;
	 */
	String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
	
	public void eat() { 
		  System.out.println("�Է�"); 
	}
	  
	public void sleep() { 
		  System.out.println("˯��"); 
	}
	
	private void speak() {
		System.out.println("����һѧ��");
	}
	 
	public void Study() {
		System.out.println("ѧϰ");
	}
	
	public void show() {
		System.out.println("name:"+name+" age:"+getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
