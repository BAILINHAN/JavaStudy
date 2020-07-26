package com.linhan.bai.day17;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//1.接口中定义的静态方法，只能通过接口来调用
		//2.通过实现类的对象，可以调用接口中的默认方法
		//如果实现类重写了接口中的默认方法，那么调用时，调用的是重写之后的方法
		//3.如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法
		//那么子类在没有重写此方法的情况下，默认调用的是父类中的同名参数的方法--->类优先原则
		//接口和父类中重名，并且子类中没有重写该
		//方法，则默认调用父类中同名同参数的方法-->类优先原则
		//4.如果实现类实现了多个接口，而这多个接口中定义了同名同参数的方法，
		//那么在实现类没有重写此方法的情况下，报错--->接口冲突
		//这就需要在实现类中重写此方法
		s.method3();
		
		//接口中定义的静态方法，只能通过接口来调用
		CompareA.method1();
	}
}

class SubClass extends SuperClass implements CompareA, CompareB{
	
	public void method2() {
		System.out.println("CompareA:杭州");
	}
	
}

class SubClassB extends SuperClass implements CompareA, CompareB{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		CompareA.super.method2();
	}
	
	//如何在子类(或实现类)的方法中调用父类、接口中被重写的方法
	public void myMethod() {
		method3();
		super.method3();
		//调用接口当中的默认方法
		CompareA.super.method3();
		CompareB.super.method2();
	}
	
}