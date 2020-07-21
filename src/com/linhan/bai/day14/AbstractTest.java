package com.linhan.bai.day14;
/**
 * abstract�ؼ��ֵ�ʹ��
 * 1.abstract:�����
 * 2.abstract�����������εĽṹ���ࡢ����
 * 3.abstract�����ࣺ������
 * 		> ���಻��ʵ����
 * 		> ��������һ���й������������������ʵ����ʱ����(�漰���������ʵ������ȫ����)
 * 		> �����ж����ṩ����������࣬���������ʵ�����������صĲ���
 * 
 * 4.abstract���η��������󷽷�
 * 		> ���󷽷�ֻ�з�����������û�з�����
 * 		> �������󷽷�����һ����һ�������࣬��֮���������������п���û�г��󷽷�
 * 		> ��������д�˸����е����г��󷽷��󣬴����෽��ʵ����
 * 		    ������û����д���������еĳ��󷽷��������Ҳ��һ�������࣬��Ҫʹ��abstract����
 * 
 * 5.abstractʹ�õ�ע���
 * 		> abstract���������������ԣ��������Ƚṹ
 * 		> abstract������������˽�з�������̬������final������final����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��14������9:49:17
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		//һ��Person������ˣ��Ͳ���ʵ������
		//Person p1 = new Person();
		
		
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{
	String name;
	int age;
	
	//�������ʵ����ʱ��Ҫ���ù�����
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//���󷽷�
	public abstract void talk();
	
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void walk() {
		System.out.println("��·");
	}
	
}

class Student extends Person{
	
	public Student(String name, int age) {
		super(name, age);
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("ѧ������˵��");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("ѧ�����Ժ���");
	}
}
