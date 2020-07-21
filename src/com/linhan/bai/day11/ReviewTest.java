package com.linhan.bai.day11;

import org.junit.Test;

public class ReviewTest {
	
	//手动写的和自动生成的equals的区别
	@Test
	public void test2() {
		Person p = new Person("Tom",12);
		Man m = new Man("Tom", 12);
		System.out.println(p.equals(m));;
		
	}
	
	//数组也作为Object类的子类出现，可以调用Object类中声明的方法
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
