package com.linhan.bai.day17;
/**
 * JDK8�����˶���ȫ�ֳ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��25������12:41:53
 */
public interface CompareA {

	//��̬����
	public static void method1() {
		System.out.println("CompareA:����");
	}
	
	//Ĭ�Ϸ���������ʡ��public
	public default void method2() {
		System.out.println("CompareA:�Ϻ�");
	}
	
	public default void method3() {
		System.out.println("CompareA:����");
	}
	
}
