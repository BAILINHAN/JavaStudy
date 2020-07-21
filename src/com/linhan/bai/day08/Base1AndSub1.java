package com.linhan.bai.day08;

public class Base1AndSub1 {
	
	public static void main(String[] args) {
		Base1 base1 = new Base1();
		base1.add(1,2);//base1
		base1.add(1,2,3);//base1
		
		Base1 base2 = new Sub1();
		base2.add(1,2);//sub1
		base2.add(1,2,3);//sub1
		
		//多态中不能调用子类特有的方法
		
		Base1 base3 = (Sub1)base2;
		base3.add(3, 4);//sub1
		
		Sub1 s = (Sub1)base2;
		s.add(1,2,3);//sub2
		
		Sub1 s1 = new Sub1();
		s1.add(1, 2, 3);//sub2
		
	}

}

class Base1{
	public void add(int a, int... arr) {
		System.out.println("Base_1");
	}
}

class Sub1 extends Base1{
	public void add(int a, int[] arr) {
		System.out.println("Sub_1");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Sub_2");
	}
	
}