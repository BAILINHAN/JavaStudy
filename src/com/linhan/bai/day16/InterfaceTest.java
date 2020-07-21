package com.linhan.bai.day16;
/**
 * 接口的使用
 * 1.接口是使用interface关键字来定义的
 * 2.Java中，接口和类是并列的结构
 * 3.如何去定义接口，定义接口中的成员
 * 		3.1 JDK7及以前：
 * 			只能够去定义全局常量和抽象方法
 * 			> 全局常量：public static final的，但是书写时，可以省略不写
 * 			> 抽象方法：public abstract的
 * 
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 
 * 4.接口中不能定义构造器，意味着接口不可以实例化
 * 5.Java开发中，接口都通过让类去实现(implements)的方式来使用
 * 	 如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 * 	 如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为一个抽象类
 * 
 * 6.Java类可以实现多个接口 --> 弥补了Java单继承的问题
 * 	 格式： class AA extends BB implements CC, DD, EE(有继承，有实现的形式)
 * 
 * 7.接口与接口之间可以多继承
 * 
 * 8.接口的具体使用，体现多态性
 * 9.接口可以看作是一种规范
 * 
 * 抽象类和接口有哪些异同
 * >抽象类和接口都不能实例化
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月18日下午11:17:31
 */ 
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		
		Plane p = new Plane();
		p.fly();
		
	}
}

interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1;//省略了public static final
	
	//抽象方法
	public abstract void fly();
	
	void stop();//省略了public abstract
	
}

interface Attackable{
	
	void attack();
	
}

class Plane implements Flyable{

	public void fly() {
		System.out.println("通过引擎起飞");
	}

	public void stop() {
		System.out.println("驾驶员减速停止");
	}
	
}

class Kite implements Flyable{

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("通过风起飞");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("无风停止");
	}
	
}

//实现多个接口,先继承，后实现
class Bullet extends Object implements Flyable,Attackable,CC{

	public void attack() {
		// TODO Auto-generated method stub
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void method1() {
		// TODO Auto-generated method stub
		
	}

	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

/***********************************************************************/

interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA,BB{
	
}

