package com.linhan.bai.day12;
/**
 * 单例设计模式
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类智能存在一个对象实例。
 * 
 * 2. 如何实现？
 * 
 * 3. 区分饿汉式和懒汉式
 * 	  饿汉式：
 * 		直接new好了一个对象。坏处：对象的加载时间过长
 * 		好处：饿汉式是线程安全
 * 	  懒汉式：
 * 		用的时候new对象，延迟创建对象。好处：延迟对象的创建
 * 		目前的写法，坏处：线程不安全
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月8日下午11:00:40
 */

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		Bank1 bank3 = Bank1.instance;
		Bank1 bank4 = Bank1.instance;
		Bank1 bank5 = null;
		
		System.out.println(bank1 == bank2);
		System.out.println(bank3 == bank4);
		
	}

}

//饿汉式单例模式	
class Bank{
	
	//1. 私有化类的构造器
	private Bank() {
		
	}
	
	//2. 内部创建类的对象
	//4. 要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3. 提供公共的静态方法返回对象
	public static Bank getInstance() {
		return instance;
	}
	
}

class Bank1{
	
	//1. 私有化类的构造器
	private Bank1() {
		
	}
	
	//2. 内部创建类的对象
	//4. 要求此对象也必须声明为静态的
	public static final Bank1 instance = new Bank1();
	
	
}

