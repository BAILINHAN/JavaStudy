package com.linhan.bai.day12;
/**
 * ����������ʽʵ��
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��8������11:09:04
 */
public class SingletonTest2 {
	
	public static void main(String[] args) {
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		System.out.println(order1 == order2);
		
	}

}

class Order {
	
	//1.˽�л�������
	private Order() {
		
	}
	
	//2.��������ǰ���ʵ����û�г�ʼ����
	//4.�˶���Ҳ��������Ϊstatic
	//ͨ���˴���������ʽ�Ͷ���ʽ
	private static Order instance = null;
	
	//3.����public��static�ķ��ص�ǰ�����ķ���
	public static Order getInstance() {
		if(instance == null)
		{
			instance = new Order();
			return instance;
		}
			return instance;
	}
	
}
