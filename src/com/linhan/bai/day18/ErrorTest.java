package com.linhan.bai.day18;
/**
 * Error:Java������޷���������⣬�磺JVMϵͳ�ڲ�������Դ�ľ����������
 * ����: StackOverflowError��OutOfMemoryError4
 * 
 * һ�㲻��д����ԵĴ�����д���
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��27������5:00:43
 */
public class ErrorTest {
	
	public static void main(String[] args) {
		//1.ջ�����java.lang.StackOverflowError
		//main(args);
		
		//2.�������java.lang.OutOfMemoryError
		Integer[] arr = new Integer[1024*1024*1024];
		
	}

}
