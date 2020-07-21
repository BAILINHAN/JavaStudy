package com.linhan.bai.day06;

public class Student extends Person {
	
	String major;

	public Student() {
	}

	public Student(String major) {
		this.major = major;
	}

	public void study() {
		System.out.println("学习专业是："+major);
	}
	
	//对父类中的eat方法进行了重写
	public void eat() {
		System.out.println("学生要多吃有营养的食物！");
	}
	
	private void show() {
		System.out.println("我是一个学生");
	}
	
	public String info() {
		return "abc";
	}
}
