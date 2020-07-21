package com.linhan.bai.day09;

import java.util.Date;

/**
 *
 * 面试题  == 和 equals() 的区别
 * 
 * 一、回顾 == 的使用
 * ==：运算符
 * 	  1.可以使用在基本数据类型变量和引用数据类型变量中
 * 	  2.如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
 * 	  3.如果比较的是引用数据类型变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 * 	  4.== 符号使用时，必须保证符号左右两边的变量类型一致。
 * 二、equals(): 方法
 *	  1.是一个方法，而非运算符
 *	  2.只能适用于引用数据类型
 * 	  3.Object类中equals()方法的定义：
 * 	    public boolean equals(Object obj){
 * 			return (this == obj);
 * 		}
 * 		说明：Object类中定义的equals()方法和==的作用是相同的；比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 * 	  4.像String、Date、File等包装类都重写了Object类中的equals()方法，重写以后，比较的不是两个引用的地址是否相同，
 * 		而是比较两个对象的"实体内容"是否相同
 * 	  5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同，那么，我们就需要对Object类中的equals()进行重写
 * 
 * @author ZhangShengjie
 *
 * @date 2020年6月27日下午1:26:39
 */

public class EqualsTest {
	
	public static void main(String[] args) {
		//基本数据类型
		int i = 10;
		int j = 10;
		double d = 10.0;
		
		System.out.println(i == j);
		System.out.println(i == d);//自动类型提升
		
		char c = 10;
		System.out.println(i == c);//true  char型自动转换为int型
		System.out.println(c);
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);
		System.out.println(c1);
		System.out.println(c2);
		
		//引用数据类型
		Customer customer1 = new Customer("Tom",21);
		Customer customer2 = new Customer("Tom", 21);
		System.out.println(customer1 == customer2);//false
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);//false 比较的是两个对象的地址值，是引用数据类型
		
		String a = "abc";
		String b = "abc";
		System.out.println(a == b);
		System.out.println("*************Equals*************");
		System.out.println(customer1.equals(customer2));//false --> true
		System.out.println(str1.equals(str2));
		
		Date date1 = new Date(312412312523124L);
		Date date2 = new Date(312412312523124L);
		System.out.println(date1.equals(date2));
		
	}
}
