package com.linhan.bai.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;



/**
 * һ���쳣����ϵ�ṹ
 * java.lang.Throwable
 * 			---java.lang.Error:һ�㲻��д����ԵĴ�����д���
 * 			---java.lang.Exception:���Խ����쳣�Ĵ���
 * 					---����ʱ�쳣(checked)
 * 						---IOException
 * 							---FileNotFoundException
 * 						---ClassNotFoundException
 * 					---����ʱ�쳣(unchecked)
 *						---NullPointerException
 *						---ArrayIndexOutOfBoundsException
 *						---ClassCastException
 *						---NumberFormatException
 *						---InputMismatchException
 *						---ArithmaticException 
 *
 *�����⣺�������쳣������Щ������˵��
 *
 * @author ZhangShengjie
 *
 * @date 2020��7��27������5:29:32
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
		//Date��String����Object�����࣬���Բ��ܽ���ǿ��ת��
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
	
	/******************�����Ǳ���ʱ�쳣
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
