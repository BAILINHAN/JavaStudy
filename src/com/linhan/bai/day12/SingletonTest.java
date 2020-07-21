package com.linhan.bai.day12;
/**
 * �������ģʽ
 * 1. ��ν��ĵ������ģʽ�����ǲ�ȡһ���ķ�����֤�����������ϵͳ�У���ĳ�������ܴ���һ������ʵ����
 * 
 * 2. ���ʵ�֣�
 * 
 * 3. ���ֶ���ʽ������ʽ
 * 	  ����ʽ��
 * 		ֱ��new����һ�����󡣻���������ļ���ʱ�����
 * 		�ô�������ʽ���̰߳�ȫ
 * 	  ����ʽ��
 * 		�õ�ʱ��new�����ӳٴ������󡣺ô����ӳٶ���Ĵ���
 * 		Ŀǰ��д�����������̲߳���ȫ
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��8������11:00:40
 */

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		Bank1 bank3 = Bank1.instance;
		Bank1 bank4 = Bank1.instance;
		Bank1 bank5 = null;
		
		System.out.println(bank1 == bank2);
		System.out.println(bank3 == bank4);
		
	}

}

//����ʽ����ģʽ	
class Bank{
	
	//1. ˽�л���Ĺ�����
	private Bank() {
		
	}
	
	//2. �ڲ�������Ķ���
	//4. Ҫ��˶���Ҳ��������Ϊ��̬��
	private static Bank instance = new Bank();
	
	//3. �ṩ�����ľ�̬�������ض���
	public static Bank getInstance() {
		return instance;
	}
	
}

class Bank1{
	
	//1. ˽�л���Ĺ�����
	private Bank1() {
		
	}
	
	//2. �ڲ�������Ķ���
	//4. Ҫ��˶���Ҳ��������Ϊ��̬��
	public static final Bank1 instance = new Bank1();
	
	
}

