package com.linhan.bai.day02;

public class Person {
	
	private int age;
	
	public int getAge() {
		 return age;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 130) {
			throw new RuntimeException("传入数据非法！");
		}else {
			this.age = age;
		}
	}

}
