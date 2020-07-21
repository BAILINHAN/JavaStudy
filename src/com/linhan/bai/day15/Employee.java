package com.linhan.bai.day15;
/**
 * 定义一个Employee类，该类包含：
 * private 的成员变量name,number,birthday,其中birthday为MyDate类的对象
 * abstract方法earnings();
 * toString()方法输出的对象name,number和birthday
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月18日上午11:48:15
 */
public abstract class Employee {
	
	private String name;
	private int number;
	private MyDate birthday;
	
	public abstract int earnings();

	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "name=" + name + ", number=" + number + ", birthday=" + birthday.toDateString();
	}
	
}
