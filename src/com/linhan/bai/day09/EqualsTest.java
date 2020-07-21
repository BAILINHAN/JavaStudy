package com.linhan.bai.day09;

import java.util.Date;

/**
 *
 * ������  == �� equals() ������
 * 
 * һ���ع� == ��ʹ��
 * ==�������
 * 	  1.����ʹ���ڻ����������ͱ����������������ͱ�����
 * 	  2.����Ƚϵ��ǻ����������ͱ������Ƚ�������������������Ƿ���ȡ�����һ������Ҫ��ͬ��
 * 	  3.����Ƚϵ��������������ͱ������Ƚ���������ĵ�ֵַ�Ƿ���ͬ�������������Ƿ�ָ��ͬһ������ʵ��
 * 	  4.== ����ʹ��ʱ�����뱣֤�����������ߵı�������һ�¡�
 * ����equals(): ����
 *	  1.��һ�����������������
 *	  2.ֻ��������������������
 * 	  3.Object����equals()�����Ķ��壺
 * 	    public boolean equals(Object obj){
 * 			return (this == obj);
 * 		}
 * 		˵����Object���ж����equals()������==����������ͬ�ģ��Ƚ���������ĵ�ֵַ�Ƿ���ͬ�������������Ƿ�ָ��ͬһ������ʵ��
 * 	  4.��String��Date��File�Ȱ�װ�඼��д��Object���е�equals()��������д�Ժ󣬱ȽϵĲ����������õĵ�ַ�Ƿ���ͬ��
 * 		���ǱȽ����������"ʵ������"�Ƿ���ͬ
 * 	  5.ͨ������£������Զ���������ʹ��equals()�Ļ���Ҳͨ���ǱȽ����������"ʵ������"�Ƿ���ͬ����ô�����Ǿ���Ҫ��Object���е�equals()������д
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��27������1:26:39
 */

public class EqualsTest {
	
	public static void main(String[] args) {
		//������������
		int i = 10;
		int j = 10;
		double d = 10.0;
		
		System.out.println(i == j);
		System.out.println(i == d);//�Զ���������
		
		char c = 10;
		System.out.println(i == c);//true  char���Զ�ת��Ϊint��
		System.out.println(c);
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);
		System.out.println(c1);
		System.out.println(c2);
		
		//������������
		Customer customer1 = new Customer("Tom",21);
		Customer customer2 = new Customer("Tom", 21);
		System.out.println(customer1 == customer2);//false
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);//false �Ƚϵ�����������ĵ�ֵַ����������������
		
		String a = "abc";
		String b = "abc";
		System.out.println(a == b);
		System.out.println("*************Equals*************");
		System.out.println(customer1.equals(customer2));//false --> true
		System.out.println(str1.equals(str2));
		
		Date date1 = new Date(312412312523124L);
		Date date2 = new Date(312412312523124L);
		System.out.println(date1.equals(date2));
		
	}
}
