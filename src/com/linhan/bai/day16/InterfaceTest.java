package com.linhan.bai.day16;
/**
 * �ӿڵ�ʹ��
 * 1.�ӿ���ʹ��interface�ؼ����������
 * 2.Java�У��ӿں����ǲ��еĽṹ
 * 3.���ȥ����ӿڣ�����ӿ��еĳ�Ա
 * 		3.1 JDK7����ǰ��
 * 			ֻ�ܹ�ȥ����ȫ�ֳ����ͳ��󷽷�
 * 			> ȫ�ֳ�����public static final�ģ�������дʱ������ʡ�Բ�д
 * 			> ���󷽷���public abstract��
 * 
 * 		3.2 JDK8�����˶���ȫ�ֳ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���
 * 
 * 4.�ӿ��в��ܶ��幹��������ζ�Žӿڲ�����ʵ����
 * 5.Java�����У��ӿڶ�ͨ������ȥʵ��(implements)�ķ�ʽ��ʹ��
 * 	 ���ʵ���า���˽ӿ��е����г��󷽷������ʵ����Ϳ���ʵ����
 * 	 ���ʵ����û�и��ǽӿ��е����г��󷽷������ʵ������Ϊһ��������
 * 
 * 6.Java�����ʵ�ֶ���ӿ� --> �ֲ���Java���̳е�����
 * 	 ��ʽ�� class AA extends BB implements CC, DD, EE(�м̳У���ʵ�ֵ���ʽ)
 * 
 * 7.�ӿ���ӿ�֮����Զ�̳�
 * 
 * 8.�ӿڵľ���ʹ�ã����ֶ�̬��
 * 9.�ӿڿ��Կ�����һ�ֹ淶
 * 
 * ������ͽӿ�����Щ��ͬ
 * >������ͽӿڶ�����ʵ����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��18������11:17:31
 */ 
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		
		Plane p = new Plane();
		p.fly();
		
	}
}

interface Flyable{
	
	//ȫ�ֳ���
	public static final int MAX_SPEED = 7900;//��һ�����ٶ�
	int MIN_SPEED = 1;//ʡ����public static final
	
	//���󷽷�
	public abstract void fly();
	
	void stop();//ʡ����public abstract
	
}

interface Attackable{
	
	void attack();
	
}

class Plane implements Flyable{

	public void fly() {
		System.out.println("ͨ���������");
	}

	public void stop() {
		System.out.println("��ʻԱ����ֹͣ");
	}
	
}

class Kite implements Flyable{

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("ͨ�������");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�޷�ֹͣ");
	}
	
}

//ʵ�ֶ���ӿ�,�ȼ̳У���ʵ��
class Bullet extends Object implements Flyable,Attackable,CC{

	public void attack() {
		// TODO Auto-generated method stub
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

	public void method1() {
		// TODO Auto-generated method stub
		
	}

	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

/***********************************************************************/

interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA,BB{
	
}

