package com.linhan.bai.day13;
/**
 * �����Կ��Ը�ֵ��λ�ã�
 * �� Ĭ�ϳ�ʼ��
 * �� ��ʾ��ʼ��   �� �ڴ�����и�ֵ  //��˭��д����˭��ִ��
 * �� �������г�ʼ��
 * �� ���˶����Ժ󣬿���ͨ��"����.����"��"����.����"�ķ�ʽ�����и�ֵ
 * 
 * 
 * ִ�е��Ⱥ�˳�� �� - �� / �� - �� - �� 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��11������12:45:16
 */

public class OrderTest {
	
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.orderId);
	}
	
	public void show() {
		System.out.println("show()");
	}
	
	public int show(int a) {
		System.out.println("show(" + a + ")");
		return 0;
	}

}

class Order{
	int orderId = 3;
	
	{
		orderId = 4;
	}
}

