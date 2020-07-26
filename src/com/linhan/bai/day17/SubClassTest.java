package com.linhan.bai.day17;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//通过实现类的对象，可以调用接口中的默认方法
		//如果实现类重写了接口中的默认方法，那么调用时，调用的是重写之后的方法
		//接口和父类中重名，并且子类中没有重写该
		//方法，则默认调用父类中同名同参数的方法-->类优先原则
		s.method3();
		
		//接口中定义的静态方法，只能通过接口来调用
		CompareA.method1();
	}
}

class SubClass extends SuperClass implements CompareA{
	
	public void method2() {
		System.out.println("CompareA:杭州");
	}
	
}