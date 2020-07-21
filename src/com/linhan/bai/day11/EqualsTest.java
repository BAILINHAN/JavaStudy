package com.linhan.bai.day11;

public class EqualsTest {
	public static void main(String[] args) {
		User u1 = new User("lisi",200);
		User u2 = new User("lisi",200);
		//只有包装类中定义了数组-127~128
		
		System.out.println(u1.equals(u2));;
		
	}
}

class User{
	String name;
	int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof User) {
			User u = (User)obj;
			return u.age == this.age && u.name.equals(this.name);
		}else {
			return false;
		}
	}
	
}