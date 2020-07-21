package com.linhan.bai.day08;

public class FieldMethodTest {
	
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.count);//20
		s.display();//20
		Base b = s;
		// == :对于引用数据类型来讲，比较的是两个引用数据类型的地址值是否相同
		System.out.println(b ==s);//true
		System.out.println(b.count);//10  属性方面不体现多态性，编译运行都看左边
		b.display();//20：多态性，实际执行的是子类中重写的方法，属性不覆盖，声明为谁，就调用的谁的属性（编译运行都看左边）
	}

}

class Base{
	int count = 10;
	
	public void display() {
		System.out.println(this.count);
	}
}

class Sub extends Base{
	int count = 20;
	
	public void display() {
		System.out.println(this.count);
	}
	
}