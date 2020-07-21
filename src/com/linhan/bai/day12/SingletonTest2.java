package com.linhan.bai.day12;
/**
 * 单例的懒汉式实现
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月8日下午11:09:04
 */
public class SingletonTest2 {
	
	public static void main(String[] args) {
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		System.out.println(order1 == order2);
		
	}

}

class Order {
	
	//1.私有化构造器
	private Order() {
		
	}
	
	//2.先声明当前类的实例，没有初始化。
	//4.此对象也必须声明为static
	//通过此处区分懒汉式和饿汉式
	private static Order instance = null;
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance() {
		if(instance == null)
		{
			instance = new Order();
			return instance;
		}
			return instance;
	}
	
}
