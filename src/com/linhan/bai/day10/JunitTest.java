package com.linhan.bai.day10;

import org.junit.Test;

/**
 * Java中的JUnit单元测试
 * 步骤：
 * 1.选中当前工程，build path --> add libraries --> JUnit 添加JUnit包
 * 2.创建一个Java类，进行单元测试
 * 	 此时的Java类要求：①此类是公共(public)的  ②此类要提供一个公共的无参的构造器
 * 3.此类中声明单元测试方法。
 * 	 此时的单元测试方法：方法的权限是public,没有返回值,没有形参
 * 4.此单元测试方法上需要声明注解：@Test,并在单元测试类中导入：import org.junit.Test;
 * 5.声明好单元测试方法以后，就可以在方法体内测试相关的代码。
 * 6.写完代码以后，左键双击单元测试方法名，右键：run as - JUnit Test
 * 
 * 说明：
 * 1.如果执行结果没有任何异常：绿条
 * 2.如果执行结果出现异常：红条
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月1日下午10:02:44
 */
public class JunitTest {
	
	@Test
	public void testEquals() {
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
	}

}
