package com.linhan.bai.day18;

import com.linhan.bai.day18.Person.Bird;
import com.linhan.bai.day18.Person.Dog;

/**
 * ����ڲ���Ա֮�壺�ڲ���
 * 1.Java������һ����A��������һ����B�У�����A�����ڲ��࣬��B��Ϊ�ⲿ��
 * 2.�ڲ���ķ��ࣺ��Ա�ڲ��� vs �ֲ��ڲ���(�����ڡ�������ڡ���������)
 * 3.��Ա�ڲ��ࣺ
 * 		һ���棺��Ϊ�ⲿ��ĳ�Ա
 * 					> �����ⲿ��Ľṹ
 * 					> ���Ա�static����(�ⲿ�಻�ܱ�static���Σ��ڲ������)
 * 					> ���Ա�4�ֲ�ͬȨ�޵����η�����
 * 		��һ���棬��Ϊһ���ࣺ
 * 					> ���ڿ��Զ������ԡ���������������
 * 					> ���Ա�final���Σ���ʾ���಻�ܱ��̳�(��ʹ��final���Ա��̳�)
 * 					> ���Ա�abstract���Σ�
 * 4.��ע�����������⣺
 * 		4.1 ���ʵ������Ա�ڲ������
 * 		4.2 ����ڳ�Ա�ڲ��������ֵ����ⲿ��Ľṹ
 * 		4.3 �����оֲ��ڲ����ʹ��:��InnerClassTest1.java
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��26������4:24:48
 */
public class InnerClassTest {
	
	public static void main(String[] args) {
		
		//����Dog��ʵ��
		Person.Dog dog = new Person.Dog();
		dog.show();

		Person p = new Person();
		Person.Bird bird = p.new Bird();
		
		bird.sing();
		bird.display("���");
		
			
	}

}

class Person{
	
	String name = "С��";
	int age;
	
	public void eat() {
		System.out.println("�ˣ��Է�");
	}
	
	//��Ա�ڲ���
	static class Dog{
		
		String name;
		int age;
		
		public void show() {
			System.out.println("����������");
		}
		
	}
	
	final class Bird{
		
		String name = "�ž�";
		
		public Bird() {
			
		}
		
		public void display(String name) {
			System.out.println(name);//�����β�
			System.out.println(this.name);//�ڲ��������
			System.out.println(Person.this.name);//�ⲿ�������
			System.out.println(age);
		}
		
		public void sing() {
			System.out.println("����һֻСС��");
			Person.this.eat();//�����ⲿ��ķǾ�̬����
		}
		
	}
		
	public Person() {
		//�ֲ��ڲ���
		class CC{
			
		}
	}
	
	public void method() {
		class AA{
			
		}
	}
	
	{
		class BB{
			
		}
	}

}
