package com.linhan.bai.day06;

public class Student extends Person {
	
	String major;

	public Student() {
	}

	public Student(String major) {
		this.major = major;
	}

	public void study() {
		System.out.println("ѧϰרҵ�ǣ�"+major);
	}
	
	//�Ը����е�eat������������д
	public void eat() {
		System.out.println("ѧ��Ҫ�����Ӫ����ʳ�");
	}
	
	private void show() {
		System.out.println("����һ��ѧ��");
	}
	
	public String info() {
		return "abc";
	}
}
