package com.linhan.bai.day03;
/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020年5月29日下午10:01:43
 * 
 * JavaBean是一种Java语言写成的可重用组件。
 * 所谓JavaBean，是指符合如下标准的Java类：
 * >类是公共的
 * >有一个无参的公共的构造器
 * >有属性、且有对应的get、set方法
 * 
 * 在类的方法中或类的构造器中，可以使用this.属性或this.方法的方式来调用当前对象、正在创建的对象的属性\方法，但一般都省略this.
 * 特殊情况下，如果方法的形参和类的属性同名时，必须要显式的使用‘this.变量’的方式来表明变量为属性，而非形参
 * this理解为：当前对象或当前正在创建的对象
 * 
 * 规定："this(形参列表)"必须声明在当前构造器的首行
 * 构造器中不能通过"this(形参列表)"方式调用自己
 * 
 */
public class Customer {
	
	 private int id;
	 private String name;
	
	 public Customer(int id) {
		 this.id = id;
		 System.out.println("加工执行共40行代码......");
	 }	
	 
	 public Customer(String name, int id) {
		 this(id);
		 this.name = name;
	 }
	 
	 public void setId(int id) {
		 this.id = id;
	 }

	 public int getId() {
		 return id;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
}
