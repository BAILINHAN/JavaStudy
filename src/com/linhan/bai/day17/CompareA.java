package com.linhan.bai.day17;
/**
 * JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月25日下午12:41:53
 */
public interface CompareA {

	//静态方法
	public static void method1() {
		System.out.println("CompareA:北京");
	}
	
	//默认方法，可以省略public
	public default void method2() {
		System.out.println("CompareA:上海");
	}
	
	public default void method3() {
		System.out.println("CompareA:杭州");
	}
	
}
