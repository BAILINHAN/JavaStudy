package com.linhan.bai.day11;

import org.junit.Test;

public class ReviewTest {
	
	//�ֶ�д�ĺ��Զ����ɵ�equals������
	@Test
	public void test2() {
		Person p = new Person("Tom",12);
		Man m = new Man("Tom", 12);
		System.out.println(p.equals(m));;
		
	}
	
	//����Ҳ��ΪObject���������֣����Ե���Object���������ķ���
	@Test
	public void test1() {
		int[] obj = new int[] {1,2,3};
		pring(obj);
		
		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getSuperclass());
		
	}
	
	public void pring(Object obj) {
		System.out.println(obj);
	}
	
	
}
