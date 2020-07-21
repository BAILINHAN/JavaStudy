package com.linhan.bai.day07;

/**
 * 面向对象特性之三：多态性(多种形态)
 * 
 * 理解多态性：可以理解为一个事物的多种形态
 * 
 * 何为多态性：
 * 		对象的多态性，父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * 
 * 多态的使用：虚拟方法调用
 * 有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在执行期，我们实际执行的是子类重写父类的方法
 * 编译看左边，执行看右边（只适用于方法，不适用于属性）
 * 
 * 多态性的使用前提：① 类的继承关系  ② 要有方法的重写  
 * 
 * 对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）
 * 
 * @author ZhangShengjie
 *
 * @date 2020年6月21日下午1:02:18
 */
public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		/*****************对象的多态性****************/
		//一个对象体现了多种形态，对象的多态性：父类的引用指向子类的对象	
		Person person2 = new Man();
		Person person3 = new Women();
		//多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法----虚拟方法调用
		person2.eat();
		person3.eat();
		
		//id为1001;
		System.out.println(person2.id);
		
		/*有了对象的多态性之后，内存中实际上是加载了子类的特有的属性和方法的，
		但是由于变量声明为父类类型，导致编译时只能调用父类中声明的属性和方法*/
		//如何才能调用子类特有的属性和方法？--->使用强制类型转换符（向下转型）
		Man m1 = (Man)person2;		
		m1.isSmoking = true;
		m1.earnMoney();
		
		//使用强转时，可能出现ClassCastException的异常
//		Women w1 = (Women)person2;
//		w1.goShopping();
		//为了避免出现这样的问题，引入了instanceof关键字
		/**
		 * instanceof关键字的使用
		 * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
		 * 为了避免在向下转型时出现ClassCastException的异常，在向下转型之前，先进行instanceof的判断
		 * 一旦返回为true，就进行向下转型；如果返回false，就不进行向下转型。
		 * 
		 * 如果 a instanceof A 返回true，a instanceof B 也返回true，则类B是类A的父类。
		 * 
		 * 
		 */
		if(person2 instanceof Women) {
			System.out.println("***Women***");
			Women w = (Women)person2;
			w.goShopping();
		}else if(person2 instanceof Man) {
			System.out.println("***Man***");
			Man m = (Man)person2;
			m.earnMoney();
		}
		if(person2 instanceof Person) {
			System.out.println("Person是Man的父类");
		}
		//父类对象不能向下转型，因为父类对象没有子类对象特有的功能
		//举例一：
		Person person4 = new Person();
		Man m = (Man)person4;
		//举例二：
		Person person5 = new Women();
		Man m2 = (Man)person5;
		
		//编译运行都通过
		Object object = new Women();
		Person person6 = (Person)object;

		//编译不通过，必须右边为左边的子类才可以赋值。
//		Man man = new Women();
		
	}

}
