package com.linhan.bai.day18;

public class InnerClassTest2 {
	
	/**
	 * 在局部内部类的方法中(比如：show)如果调用局部内部类所声明的方法(如：method)中
	 * 的局部变量(比如：num)，要求此局部变量声明为final的
	 * 
	 * JDK 7及之前版本，要求此局部变量显式的声明为final的
	 * JDK 8及以后的版本，可以省略final的声明
	 * 
	 */
	public void method() {
		//局部变量
		int num = 10;
		
		class AA{
			public void show() {
				System.out.println(num);
			}
		}
		
	}
	
}
