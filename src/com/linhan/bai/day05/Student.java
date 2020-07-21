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
		  System.out.println("吃饭"); 
	}
	  
	public void sleep() { 
		  System.out.println("睡觉"); 
	}
	
	private void speak() {
		System.out.println("我是一学生");
	}
	 
	public void Study() {
		System.out.println("学习");
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
