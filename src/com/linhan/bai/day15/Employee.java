package com.linhan.bai.day15;
/**
 * ����һ��Employee�࣬���������
 * private �ĳ�Ա����name,number,birthday,����birthdayΪMyDate��Ķ���
 * abstract����earnings();
 * toString()��������Ķ���name,number��birthday
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��18������11:48:15
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
