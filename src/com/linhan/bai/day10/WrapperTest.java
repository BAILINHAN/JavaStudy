package com.linhan.bai.day10;

import org.junit.Test;

/**
 * 包装类的使用：
 * 1.Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 2.掌握：基本数据类型，包装类，String三者之间的相互转换
 * 
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月2日下午9:51:17
 */

public class WrapperTest {
	
	/*
	 * JDK 5.0 新特性：自动装箱与拆箱
	 */
	@Test
	public void test3() {
		int num1 = 10;
		method(num1);
		
		//自动装箱：
		int num2 = 10;
		Integer in1 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		
		//自动拆箱：包装类-->基本数据类型
		System.out.println(in1.toString());
		
		int num3 = in1;
		boolean b3 = b2;
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	//基本数据类型--->包装类：调用包装类的构造器
	@Test
	public void test1() {
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		Float f1 = new Float(12.56f);
		Float f2 = new Float("12.36");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean("true123");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		//忽略大小写只要跟true一样就可以
		System.out.println(b3.toString());
		
		Order order = new Order();
		System.out.println(order.isMale);//false,因为是基本数据类型，默认值为false
		System.out.println(order.isFemale);//null,因为现在Boolean是一个类了，所以说是null
		
	}
	
	//包装类--->基本数据类型:调用包装类的xxxValue()
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		//转换为int类型
		int i1 = in1.intValue();
		System.out.println(i1+1);
		
		Float fl1 = new Float(12.3);
		float f1 = fl1.floatValue();
		System.out.println(f1+1);
		
	}
	
	//基本数据类型、包装类-->String
	@Test
	public void test4() {
		int num1 = 10;
		//方式一：做连接运算
		String s1 = 10+"";
		//方式二：
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		System.out.println(str2);
		System.out.println(s1);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str3);//"12.4"
		
	}
	
	//String-->基本数据类型、包装类：调用包装类的parseXxx(String s)
	@Test
	public void test5() {
		String str1 = "123";
		int int1 = Integer.parseInt(str1);
	
		System.out.println(int1 + 1);
		
		String str2 = "tRuE";
		boolean b1 = Boolean.parseBoolean(str2);
		
		System.out.println(b1);
		
	}
	
	@Test
	public void test6() {
		//三元运算符的类型需要统一
		Object o1 = true ? new Integer(1) : new Double(1.5);//Integer的类型会自动提升为double类型
		System.out.println(o1);//1.0
		Object o3 = new Object();
		Integer in1 = new Integer(1);
		o3 = in1;
		System.out.println(o3);
		System.out.println(in1);
		
		Circle circle = new Circle(1.5);
		System.out.println(circle);
		
		GeometricObject geometricObject = new GeometricObject("blue", 1.5);
		System.out.println(geometricObject);
		
		Object o2;
		if(true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);//1
		
	}
	
	@Test
	public void test7() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		/*
		 * Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]，保存了从 -128 ~ 127 范围内的整数
		 * 如果我们用自动装箱的方式，给Integer赋值的范围在 -128 ~ 127 范围内时，可以直接使用数组中的元素，就不用
		 * 再去new了。目的是为了提高效率
		 * 
		 */
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
	
		//128超出 -127 ~ 128的范围，所以new出了一个新的地址存放128
		Integer x = 128;//相当于new了一个Integer对象
		Integer y = 128;
		System.out.println(x == y);//false
		
		Integer num1 = 5;
		Integer num2 = 5;
		System.out.println(num1 == num2);//true
		
		int num3 = 200;
		int num4 = 200;
		System.out.println(num3 == num4);
		
		
	}
	
	

}

class Order{
	boolean isMale;
	Boolean isFemale;
}


