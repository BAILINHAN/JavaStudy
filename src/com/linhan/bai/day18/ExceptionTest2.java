package com.linhan.bai.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �쳣����ķ�ʽ����throws + �쳣����
 * 
 * 1."throws + �쳣����"д�ڷ�������������ָ���˷���ִ��ʱ�����ܻ��׳����쳣����
 * һ����������ִ��ʱ�������쳣���Ի����쳣���봦����һ���쳣��Ķ��󣬴˶�������
 * throws����쳣����ʱ���ͻᱻ�׳����쳣�ʹ�������������Ĵ���Ͳ���ִ�С�
 *  
 * 2.��᣺try-catch-finally�������Ľ��쳣��������ˡ�
 * 		   throws�ķ�ʽֻ�ǽ��쳣�׸��˷����ĵ����ߡ���û�������Ľ��쳣�������
 * 
 * 3.���������ѡ��ʹ��try-catch-finally ����ʹ��throws
 * 		3.1 ��������б���д�ķ���û��ʹ��throws��ʽ�����쳣����������д�ķ���Ҳ����ʹ��throws
 * 		      ��ζ�����������д�ķ��������쳣������ʹ��try-catch-finally��ʽ����
 * 		3.2 ִ�еķ����У��Ⱥ��ֵ���������ļ����������⼸�������ǵݽ���ϵִ�еģ����ǽ����⼸��
 * 		      ����ʹ��throws�ķ�ʽ���д�����ִ�еķ���a���Կ���ʹ��try-catch-finally�ķ�ʽ���д���
 * 		3.3
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��28������7:25:59
 */
public class ExceptionTest2 {
	
	public static void main(String[] args) {
		try {
			method2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		method3();
		
	}

	public static void method3() {
		try {
			method2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void method2() throws FileNotFoundException,IOException {
		method1();
	}
	
	public static void method1() throws FileNotFoundException,IOException{
		
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.print((char)data);
			data = fis.read();
		}
		fis.close();
		
	}

}
