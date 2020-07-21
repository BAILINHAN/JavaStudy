package com.linhan.bai.day07;

import java.sql.Connection;

/**
 * 多态性的使用
 * 
 * @author ZhangShengjie
 *
 * @date 2020年6月21日下午1:52:26
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest animalTest = new AnimalTest();
		animalTest.function(new Dog());
		animalTest.function(new Cat());
	}
	
	public void function(Animal animal) {
		animal.eat();
		animal.shout();
	}

	public void function(Cat cat) { 
		cat.eat();
		cat.shout();
	}
}

class Animal{
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void shout() {
		System.out.println("动物叫");
	}
	
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void shout() {
		System.out.println("汪汪汪");
	}
	
}

class Cat extends Animal{
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void shout() {
		System.out.println("喵喵喵");
	}
	
}

class Order{
	public void method(Object object) {
		
	}
}

class Driver{
	public void doData(Connection conn) {
		
	}
}

