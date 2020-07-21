package com.linhan.bai.day07;

import java.sql.Connection;

/**
 * ��̬�Ե�ʹ��
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��21������1:52:26
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
		System.out.println("�����ʳ");
	}
	
	public void shout() {
		System.out.println("�����");
	}
	
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
	
	public void shout() {
		System.out.println("������");
	}
	
}

class Cat extends Animal{
	
	public void eat() {
		System.out.println("è����");
	}
	
	public void shout() {
		System.out.println("������");
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

