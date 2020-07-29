package com.linhan.bai.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * һ���쳣�Ĵ���:ץ��ģ��
 * ����һ��"��"��������ִ�еĹ����У�һ�������쳣���ͻ����쳣���봦����һ����Ӧ�쳣��
 * �Ķ��󣬽��˶����׳���
 * һ���׳������Ժ����Ĵ���Ͳ���ִ�С�
 * 
 * ���̶���"ץ"���������Ϊ�쳣�Ĵ���ʽ���� try-catch-finally  �� throws
 * 
 * ����try-catch-finally��ʹ��
 * try{
 * 		//���ܳ����쳣�Ĵ���
 * }catch(�쳣����1 ������1){
 * 		//�����쳣�ķ�ʽ1
 * }catch(�쳣����2 ������2){
 * 		//�����쳣�ķ�ʽ2
 * }catch(�쳣����3 ������3){
 * 		//�����쳣�ķ�ʽ3
 * }finally{
 * 		//һ����ִ�еĴ���
 * }										
 * 
 * ˵����
 * 1.finally�ǿ�ѡ��
 * 2.ʹ��try�����ܳ��ֵ��쳣�����װ��������ִ�й����У�һ�������쳣���ͻ�����һ����Ӧ
 * �쳣�Ķ��󣬸��ݴ˶�������ͣ�ȥcatch�н���ƥ��
 * 3.һ��try�е��쳣����ƥ�䵽ĳһ��catchʱ���ͽ���catch�н����쳣����һ���������
 * ��������ǰ��try-catch�ṹ(��û��дfinally�������)����ִ�����Ĵ���
 * 4.catch�е��쳣���ͣ����û���Ӹ����ϵ��������˳������ν
 * 	 catch�е��쳣������������Ӹ����ϵ����Ҫ������һ�������ڸ�������棬���򱨴�
 * 5.���õ��쳣������ķ�ʽ���� String getMessage() �� printStackTrace
 * 6.��try�ṹ�������ı������ڳ���try�ṹ�Ժ󣬾Ͳ����ڱ�����
 * 7.try-catch-finally�Ľṹ����Ƕ��
 * 
 * ���1��ʹ��try-catch-finally�������ʱ�쳣��ʹ�ó����ڱ���ʱ�Ͳ��ٱ�����������ʱ
 * �Կ��ܱ����൱������ʹ��try-catch-finally��һ������ʱ���ܳ��ֵ��쳣���ӳٵ�����
 * ʱ���֡�
 * 
 * ���2����������������ʱ�쳣�Ƚϳ�������������ͨ���Ͳ��������ʱ�쳣��дtry-catch-finally
 * ����ڱ���ʱ�쳣������һ��Ҫ�����쳣����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��28������3:38:49
 */
public class ExceptionTest1 {
	
	@Test
	public void test1() {
		
		String str = "123";
		str = "abc";
		int num = 0;
		try {
			num = Integer.parseInt(str);
		
			System.out.println("hello ----1");

		}catch (NullPointerException e) {
			System.out.println("���ֿ�ָ���쳣.....");
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("������ֵת���쳣......");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("�����쳣.....");
		}
		System.out.println(num);
		System.out.println("hello ----2");
		
	}
	
	@Test
	public void test7() {
		try {
			File file = new File("hello.txt");
			FileInputStream fis = new FileInputStream(file);
			
			int data = fis.read();
			if(data != -1) {
				System.out.print((char)data);
				fis.read();
			}
			fis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
