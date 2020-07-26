package com.linhan.bai.day18;

import com.linhan.bai.day18.Person.Bird;
import com.linhan.bai.day18.Person.Dog;

/**
 * 类的内部成员之五：内部类
 * 1.Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B成为外部类
 * 2.内部类的分类：成员内部类 vs 局部内部类(方法内、代码块内、构造器内)
 * 3.成员内部类：
 * 		一方面：作为外部类的成员
 * 					> 调用外部类的结构
 * 					> 可以被static修饰(外部类不能被static修饰，内部类可以)
 * 					> 可以被4种不同权限的修饰符修饰
 * 		另一方面，作为一个类：
 * 					> 类内可以定义属性、方法、构造器等
 * 					> 可以被final修饰，表示此类不能被继承(不使用final可以被继承)
 * 					> 可以被abstract修饰，
 * 4.关注如下三个问题：
 * 		4.1 如何实例化成员内部类对象
 * 		4.2 如何在成员内部类中区分调用外部类的结构
 * 		4.3 开发中局部内部类的使用:见InnerClassTest1.java
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月26日下午4:24:48
 */
public class InnerClassTest {
	
	public static void main(String[] args) {
		
		//创建Dog的实例
		Person.Dog dog = new Person.Dog();
		dog.show();

		Person p = new Person();
		Person.Bird bird = p.new Bird();
		
		bird.sing();
		bird.display("黄鹂");
		
			
	}

}

class Person{
	
	String name = "小明";
	int age;
	
	public void eat() {
		System.out.println("人：吃饭");
	}
	
	//成员内部类
	static class Dog{
		
		String name;
		int age;
		
		public void show() {
			System.out.println("卡拉是条狗");
		}
		
	}
	
	final class Bird{
		
		String name = "杜鹃";
		
		public Bird() {
			
		}
		
		public void display(String name) {
			System.out.println(name);//方法形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
			System.out.println(age);
		}
		
		public void sing() {
			System.out.println("我是一只小小鸟");
			Person.this.eat();//调用外部类的非静态属性
		}
		
	}
		
	public Person() {
		//局部内部类
		class CC{
			
		}
	}
	
	public void method() {
		class AA{
			
		}
	}
	
	{
		class BB{
			
		}
	}

}
