package com.linhan.bai.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;



/**
 * 一、异常的体系结构
 * java.lang.Throwable
 * 			---java.lang.Error:一般不编写针对性的代码进行处理
 * 			---java.lang.Exception:可以进行异常的处理
 * 					---编译时异常(checked)
 * 						---IOException
 * 							---FileNotFoundException
 * 						---ClassNotFoundException
 * 					---运行时异常(unchecked)
 *						---NullPointerException
 *						---ArrayIndexOutOfBoundsException
 *						---ClassCastException
 *						---NumberFormatException
 *						---InputMismatchException
 *						---ArithmaticException 
 *
 *面试题：常见的异常都有哪些？举例说明
 *
 * @author ZhangShengjie
 *
 * @date 2020年7月27日下午5:29:32
 */
public class ExceptionTest {
	
	//NullPointerException
	@Test
	public void test1() {
		int[] arr = null;
		System.out.println(arr[3]);
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
	}
	
	//ArrayIndexOutOfBoundsException
	@Test
	public void test2() {
		int[] arr = new int[10];
		System.out.println(arr[10]);
	}
	
	//ClassCastException
	@Test
	public void test3() {
		//Date和String都是Object的子类，所以不能进行强制转型
		Object obj = new Date();
		String str = (String)obj;
	}
	
	//NumberFormatException
	@Test
	public void test4() {
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
		
	}
	
	//InputMismatchException
	@Test
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(score);
		sc.close();
	}
	
	//ArithmaticException
	@Test
	public void test6() {
		int a = 10;
		int b = 2;
		System.out.println(a/b);
		b = 0;
		System.out.println(a/b);
	}
	
	/******************以下是编译时异常
	 * @throws IOException ************************/
	@Test
	public void test7() throws Exception {
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		if(data != -1) {
			System.out.print((char)data);
			fis.read();
		}
		fis.close();
	}

}
