package com.linhan.bai.day01;

/**
 * @author ZhangShengjie
 *
 * @date 2020-5-15����10:21:58
 */
public class PersonTest { 
	public static void main(String[] args) {
		Person person_A = new Person();
		Person person_B = new Person();
		person_A.age = 21;
		person_A.name = "Tom";
		System.out.println(person_A.age);
		System.out.println(person_A.name);
		System.out.println(person_B.age);
		System.out.println(person_B.name);
		person_B = person_A;//��������ָ����ͬһ������
		System.out.println(person_B.age);
		System.out.println(person_B.name);
		person_B.age = 16;
		System.out.println(person_A.age+" "+person_B.age);
	}
}
class Person{
	int age;
	String name;
	boolean fale;
	
	void eat(){
		System.out.println("I can eat");
	}
	void speak(String language){
		System.out.println("I can speak "+language);
	}
	void Sleep(){
		System.out.println("I can sleep");
	}
	
}
