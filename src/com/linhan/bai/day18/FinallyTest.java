package com.linhan.bai.day18;
/**
 * try-catch-finally��finally��ʹ�ã�
 * 1.finally�ǿ�ѡ��
 * 2.finally����������һ���ᱻִ�еĴ��룬��ʹcatch�г������쳣��try����return���
 * catch����return���������
 * 3.�����ݿ����ӡ������������������Socket����Դ��JVM�ǲ����Զ����յģ�������Ҫ
 * �Լ��ֶ��Ľ�����Դ���ͷţ���ʱ����Դ�ͷţ�����Ҫ������finally�С�
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��28������6:40:09
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class FinallyTest {

	@Test
	public void testMethod() {
		int num = method();
			System.out.println(num);
	}
	
	public int method() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("��һ���ᱻִ��");
		}
	}
	
	@Test
	public void test1() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch (ArithmeticException e) {
//			e.printStackTrace();
			int[] arr = new int[10];
			System.out.println(arr[10]);
		}catch (Exception e) {
//			e.printStackTrace();
		}finally {
			System.out.println("finally��ִ�еĴ���.....");
		}
	}
	
	@Test
	public void test2() {
		
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
}
