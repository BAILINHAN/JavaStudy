package com.linhan.bai.day11;
/**
 * static关键字的使用
 * 1.static:静态的
 * 2.static:可以用来修饰：属性、方法、代码块、内部类
 * 3.使用static来修饰属性:静态变量(又称：类变量)
 * 		3.1属性：按是否使用static修饰，又分为：静态属性和非静态属性(实例变量)
 * 		实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改一个对象中的非静态属性
 * 				   时，不会导致其他对象中同样的属性值的修改。
 * 		静态变量：当我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象
 * 				   调用其此静态变量时，是修改过的。
 * 		3.2使用static修饰属性的其他说明：
 * 			① 静态变量随着类的加载而加载。可以通过"类.静态变量"的方式调用
 * 		  	② 静态变量的加载要早于对象的创建。
 * 			③ 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。
 *   		④ 		类变量		实例变量
 *   		类		 yes		  no
 *   		对象		 yes		  yes
 *   	3.3 静态属性举例：System.out, Math.PI;
 * 		
 * 4.使用static来修饰方法：静态方法
 * 		① 随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
 * 		② 			静态方法		非静态方法
 * 			类			 yes		   no
 * 			对象   		 yes		   yes
 * 		③ 静态方法中，只能调用静态的方法和属性
 * 		   非静态的方法中，既能够调用非静态的方法和属性，也可以调用静态的方法和属性
 * 
 * 5.static注意点
 * 	 在静态的方法内，不能使用this关键字、super关键字
 * 		
 * 6.开发中，如何确定一个属性是否要声明为static？
 * 		> 属性是可以被多个对象所共享的，不会随着对象的不同而不同的。
 * 		> 类中的常量也常常声明为static。
 * 
 * 	  开发中，如何确定一个方法是否要声明为static？
 * 		> 操作静态属性的方法通常为static的
 * 		> 工具类中的方法，习惯上声明为static的。比如：Math、Arrays、Collections
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月7日下午9:31:25	
 */

public class StaticTest {
	public static void main(String[] args) {
		
		Chinese.nation = "中国";
		Chinese.show();
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 35;
//		c2.nation = "CHINA";
//		
//		c1.nation = "CHN";
		
		System.out.println(c2.nation);
		c1.eat();
		c2.eat();
		
	}
}

class Chinese{
	
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("********调用eat()方法********");
		System.out.println("中国人吃中餐");
		//调用静态结构
		show();
		//调用非静态结构
		this.info();
	}
	
	public static void show() {
		//静态的方法中不能使用this关键字
		//不能调用非静态的结构，可以调用静态的结构
		System.out.println("我是一个中国人");
		System.out.println(Chinese.nation);
		walk();
	}
	
	public static void walk() {
		
	}
	
	public void info() {
		System.out.println("name:" + name + ",age:" + age);
	}
	
}