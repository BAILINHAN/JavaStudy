package com.linhan.bai.day14;
/**
 * abstract关键字的使用
 * 1.abstract:抽象的
 * 2.abstract可以用来修饰的结构：类、方法
 * 3.abstract修饰类：抽象类
 * 		> 此类不能实例化
 * 		> 抽象类中一定有构造器，便于子类对象实例化时调用(涉及：子类对象实例化的全过程)
 * 		> 开发中都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 * 
 * 4.abstract修饰方法：抽象方法
 * 		> 抽象方法只有方法的声明，没有方法体
 * 		> 包含抽象方法的类一定是一个抽象类，反之不成立，抽象类中可以没有抽象方法
 * 		> 若子类重写了父类中的所有抽象方法后，此子类方可实例化
 * 		    若子类没有重写父类中所有的抽象方法，则此类也是一个抽象类，需要使用abstract修饰
 * 
 * 5.abstract使用的注意点
 * 		> abstract不能用来修饰属性，构造器等结构
 * 		> abstract不能用来修饰私有方法、静态方法、final方法、final的类
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月14日上午9:49:17
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		//一旦Person类抽象了，就不能实例化了
		//Person p1 = new Person();
		
		
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{
	String name;
	int age;
	
	//子类对象实例化时需要调用构造器
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//抽象方法
	public abstract void talk();
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void walk() {
		System.out.println("走路");
	}
	
}

class Student extends Person{
	
	public Student(String name, int age) {
		super(name, age);
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("学生可以说话");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("学生可以呼吸");
	}
}
