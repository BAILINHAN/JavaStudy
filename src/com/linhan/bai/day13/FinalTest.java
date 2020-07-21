package com.linhan.bai.day13;
/**
 * final：最终的
 * 
 * 1.final可以用来修饰的结构：类、方法、变量
 * 2.final用来修饰一个类：此类不能被其他类所继承
 * 				       比如：String类、System类、StringBuffer类
 * 3.final用来修饰一个方法：表明此方法不能被重写
 * 					比如：Object类中的getClass();
 * 4.final用来修饰一个变量：此时的"变量"就成为是一个常量
 * 					4.1 final修饰属性：可以考虑赋值的位置有：显式初始化、代码块中赋值/初始化、构造器中初始化
 * 					4.2 final修饰局部变量：
 * 					    尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。
 * 					  一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 *	 static final:用来修饰属性：全局常量 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月11日下午12:52:34
 */
public class FinalTest {
	
	final int WIDTH = 10;
	final int LEFT;
	final int RIGHT;
	
	{
		LEFT = 1;
	}
	
	public FinalTest(){
		RIGHT = 2;
	}
	
	public FinalTest(int right) {
		RIGHT = right;
	}
	
	public void doWidth() {
		//被final修饰的属性不能再被赋值了
		//width = 20;
	}
	
	public void show() {
		final int NUMBER = 10;//常量
	}
	
	public int show(final int num) {
		//num = 15; //编译不通过
		System.out.println(num);
		return num + 1;
	}
	
	public static void main(String[] args) {
		FinalTest test = new FinalTest();
		test.show(10);
	}
	
	public void addOne(final Other o) {
		//o = new Other();  //编译出错
		o.i++;
	}
	
}

//被final修饰的类不能在往下有子类了
final class FinalA{
	
}

class A{
	public void show() {
		
	}
}

class B extends A{
	public final void show() {
		
	}
}

class Other{
	public int i;
}

