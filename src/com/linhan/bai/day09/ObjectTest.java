package com.linhan.bai.day09;

/**
 * java.lang.Object��
 * 1.Object��������Java��ĸ�����
 * 2.�������������δʹ��extends�ؼ���ָ���丸�࣬��Ĭ�ϸ���Ϊjava.lang.Object��
 * 3.Object���еĹ��ܣ����ԣ��������;���ͨ����
 * 4.Object��ֻ������һ���ղεĹ�����
 * 		���ԣ���
 * 		������equals()/toString()/getClass()/hashCode()/clone()/finalize()
 * 			  wait()/notify()/notifyAll()
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��27������1:04:23
 */

public class ObjectTest {
	
	public static void main(String[] args) {
		Order1 order1 = new Order1();
		System.out.println(order1.getClass().getSuperclass());
	}

}

class Order1{
	
}