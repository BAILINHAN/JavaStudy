package com.linhan.bai.day09;

import java.util.Date;

/**
 * Object����toString()��ʹ�ã�
 * 1.���������һ�����������ʱ��ʵ���Ͼ��ǵ��õ�ǰ�����toString()����
 * 2.Object����toString()�Ķ���
 * 		public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 3.��String��Date��File�Ȱ�װ���ж���д��Object���е�toString()������ʹ���ڵ��ö����toString()����ʱ������"ʵ������"��Ϣ
 * 4.�Զ�����Ҳ������дtoString()�����������ô˷���ʱ�����ض����"ʵ������"
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��29������12:07:51
 */
public class ToStringTest {
	public static void main(String[] args) {
		Customer customer = new Customer("Tom",21);
		System.out.println(customer.toString());
		System.out.println(customer);
		
		String str = new String("MM");
		System.out.println(str);//MM
		
		Date date = new Date(1241234251523L);
		System.out.println(date.toString());
		
	}
}
