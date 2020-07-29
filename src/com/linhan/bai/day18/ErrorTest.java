package com.linhan.bai.day18;
/**
 * Error:Java虚拟机无法解决的问题，如：JVM系统内部错误，资源耗尽等严重情况
 * 比如: StackOverflowError、OutOfMemoryError4
 * 
 * 一般不编写针对性的代码进行处理
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月27日下午5:00:43
 */
public class ErrorTest {
	
	public static void main(String[] args) {
		//1.栈溢出：java.lang.StackOverflowError
		//main(args);
		
		//2.堆溢出：java.lang.OutOfMemoryError
		Integer[] arr = new Integer[1024*1024*1024];
		
	}

}
