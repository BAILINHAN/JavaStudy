package com.linhan.bai.day11;
/**
 * static�ؼ��ֵ�ʹ��
 * 1.static:��̬��
 * 2.static:�����������Σ����ԡ�����������顢�ڲ���
 * 3.ʹ��static����������:��̬����(�ֳƣ������)
 * 		3.1���ԣ����Ƿ�ʹ��static���Σ��ַ�Ϊ����̬���ԺͷǾ�̬����(ʵ������)
 * 		ʵ�����������Ǵ�������Ķ������ÿ�����󶼶�����ӵ��һ�����еķǾ�̬���ԡ����޸�һ�������еķǾ�̬����
 * 				   ʱ�����ᵼ������������ͬ��������ֵ���޸ġ�
 * 		��̬�����������Ǵ�������Ķ�����󣬶��������ͬһ����̬��������ͨ��ĳһ�������޸ľ�̬����ʱ���ᵼ����������
 * 				   ������˾�̬����ʱ�����޸Ĺ��ġ�
 * 		3.2ʹ��static�������Ե�����˵����
 * 			�� ��̬����������ļ��ض����ء�����ͨ��"��.��̬����"�ķ�ʽ����
 * 		  	�� ��̬�����ļ���Ҫ���ڶ���Ĵ�����
 * 			�� ������ֻ�����һ�Σ���̬�������ڴ���Ҳֻ�����һ�ݣ����ڷ������ľ�̬���С�
 *   		�� 		�����		ʵ������
 *   		��		 yes		  no
 *   		����		 yes		  yes
 *   	3.3 ��̬���Ծ�����System.out, Math.PI;
 * 		
 * 4.ʹ��static�����η�������̬����
 * 		�� ������ļ��ض����أ�����ͨ��"��.��̬����"�ķ�ʽ���е���
 * 		�� 			��̬����		�Ǿ�̬����
 * 			��			 yes		   no
 * 			����   		 yes		   yes
 * 		�� ��̬�����У�ֻ�ܵ��þ�̬�ķ���������
 * 		   �Ǿ�̬�ķ����У����ܹ����÷Ǿ�̬�ķ��������ԣ�Ҳ���Ե��þ�̬�ķ���������
 * 
 * 5.staticע���
 * 	 �ھ�̬�ķ����ڣ�����ʹ��this�ؼ��֡�super�ؼ���
 * 		
 * 6.�����У����ȷ��һ�������Ƿ�Ҫ����Ϊstatic��
 * 		> �����ǿ��Ա��������������ģ��������Ŷ���Ĳ�ͬ����ͬ�ġ�
 * 		> ���еĳ���Ҳ��������Ϊstatic��
 * 
 * 	  �����У����ȷ��һ�������Ƿ�Ҫ����Ϊstatic��
 * 		> ������̬���Եķ���ͨ��Ϊstatic��
 * 		> �������еķ�����ϰ��������Ϊstatic�ġ����磺Math��Arrays��Collections
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��7������9:31:25	
 */

public class StaticTest {
	public static void main(String[] args) {
		
		Chinese.nation = "�й�";
		Chinese.show();
		
		Chinese c1 = new Chinese();
		c1.name = "Ҧ��";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "����";
		c2.age = 35;
//		c2.nation = "CHINA";
//		
//		c1.nation = "CHN";
		
		System.out.println(c2.nation);
		c1.eat();
		c2.eat();
		
	}
}

class Chinese{
	
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("********����eat()����********");
		System.out.println("�й��˳��в�");
		//���þ�̬�ṹ
		show();
		//���÷Ǿ�̬�ṹ
		this.info();
	}
	
	public static void show() {
		//��̬�ķ����в���ʹ��this�ؼ���
		//���ܵ��÷Ǿ�̬�Ľṹ�����Ե��þ�̬�Ľṹ
		System.out.println("����һ���й���");
		System.out.println(Chinese.nation);
		walk();
	}
	
	public static void walk() {
		
	}
	
	public void info() {
		System.out.println("name:" + name + ",age:" + age);
	}
	
}