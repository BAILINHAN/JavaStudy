package com.linhan.bai.day14;
/**
 * 关于抽象类的匿名子类
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月16日下午9:29:47
 */
public class PersonTest {
	
	public static void main(String[] args) {
		
		method(new Student());//匿名对象
		
		Woker woker = new Woker();
		method1(woker);//非匿名的类非匿名的对象
		
		method1(new Woker());//非匿名的类匿名的对象
		
		//创建一个匿名子类的对象：p  只是用一次
		Person p = new Person() {
			
			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("吃东西");
			}
			
			@Override
			public void talk() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸");
			}
		};
		
		method1(p);
		
		//创建匿名子类的匿名对象
		method1(new Person() {
			
			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("吃好吃的东西");
			}
			
			@Override
			public void talk() {
				// TODO Auto-generated method stub
				System.out.println("好好呼吸新鲜空气");
			}
		});
		
	
	}
	
	public static void method1(Person p) {
		p.breath();
		p.talk();
	}
	
	public static void method(Student s) {
		
	}

}

class Woker extends Person{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}