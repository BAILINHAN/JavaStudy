package com.linhan.bai.day18;

public class InnerClassTest2 {
	
	/**
	 * �ھֲ��ڲ���ķ�����(���磺show)������þֲ��ڲ����������ķ���(�磺method)��
	 * �ľֲ�����(���磺num)��Ҫ��˾ֲ���������Ϊfinal��
	 * 
	 * JDK 7��֮ǰ�汾��Ҫ��˾ֲ�������ʽ������Ϊfinal��
	 * JDK 8���Ժ�İ汾������ʡ��final������
	 * 
	 */
	public void method() {
		//�ֲ�����
		int num = 10;
		
		class AA{
			public void show() {
				System.out.println(num);
			}
		}
		
	}
	
}
