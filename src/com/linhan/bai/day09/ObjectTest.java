package com.linhan.bai.day09;

/**
 * java.lang.Object类
 * 1.Object类是所有Java类的根父类
 * 2.如果类在声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
 * 3.Object类中的功能（属性，方法）就具有通用性
 * 4.Object类只声明了一个空参的构造器
 * 		属性：无
 * 		方法：equals()/toString()/getClass()/hashCode()/clone()/finalize()
 * 			  wait()/notify()/notifyAll()
 * 
 * @author ZhangShengjie
 *
 * @date 2020年6月27日下午1:04:23
 */

public class ObjectTest {
	
	public static void main(String[] args) {
		Order1 order1 = new Order1();
		System.out.println(order1.getClass().getSuperclass());
	}

}

class Order1{
	
}