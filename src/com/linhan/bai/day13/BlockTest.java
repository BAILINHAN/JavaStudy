package com.linhan.bai.day13;
/**
 * ���Ա֮�ģ������(���ʼ����)
 * 
 * 1.���������ã�������ʼ������߶���
 * 2.�������������εĻ���ֻ����static����
 * 3.���ࣺ��̬����� Vs �Ǿ�̬�����
 * 4.��̬����飺
 * 	 >�ڲ�������������
 * 	 >������ļ��ض�ִ�У�����ִֻ��һ��
 * 	 >���ã���ʼ�������Ϣ
 * 	 >���һ�����ж����˶����̬�Ĵ���飬�����������Ⱥ�˳��ִ��
 * 	 >��̬������ִ��Ҫ�����ڷǾ�̬������ִ��
 * 	 >��̬�������ֻ�ܵ��þ�̬�����ԡ����������ܵ��÷Ǿ�̬�Ľṹ	
 * 
 * 5.�Ǿ�̬����飺
 * 	 >�ڲ�������������
 * 	 >���Ŷ���Ĵ�����ִ��
 * 	 >ÿ����һ�����󣬾�ִ��һ�ηǾ�̬�����
 * 	 >���ã������ڴ�������ʱ���Զ�������ԵȽ��г�ʼ��
 * 	 >���һ�����ж����˶���Ǿ�̬����飬�����������Ⱥ�˳��ִ��
 * 	 >�Ǿ�̬������ڣ����Ե��þ�̬�����ԡ���̬������Ǿ�̬�����ԡ��Ǿ�̬����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��9������10:08:16
 */
public class BlockTest {
	public static void main(String[] args) {
		
		String desc = Person.desc;
		System.out.println(desc);
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.age);
		
	}
}

class Person{
	
	//����
	String name;
	int age;
	static String desc = "����һ����";
	
	//������
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static�Ĵ���� {}
	static{
		System.out.println("Hello,static block");
		desc = "����һ����ѧϰ����";
	}
	
	static{
		System.out.println("Hello,static block - 2");
		desc = "����һ����ѧϰ����";
		//ֻ�ܵ��þ�̬�Ľṹ
		info();
	}
	
	//��static�Ĵ����{}
	{
		System.out.println("Hello,block");
		age = 1;
		//���Ե��÷Ǿ�̬�;�̬�Ľṹ
		info();
		eat();
	}
	
	//����
	public void eat() {
		System.out.println("�Է�");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info() {
		System.out.println("����һ�����ֵ��ˣ�");
	}
	
	
}