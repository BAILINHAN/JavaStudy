package com.linhan.bai.day17;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//ͨ��ʵ����Ķ��󣬿��Ե��ýӿ��е�Ĭ�Ϸ���
		//���ʵ������д�˽ӿ��е�Ĭ�Ϸ�������ô����ʱ�����õ�����д֮��ķ���
		//�ӿں͸���������������������û����д��
		//��������Ĭ�ϵ��ø�����ͬ��ͬ�����ķ���-->������ԭ��
		s.method3();
		
		//�ӿ��ж���ľ�̬������ֻ��ͨ���ӿ�������
		CompareA.method1();
	}
}

class SubClass extends SuperClass implements CompareA{
	
	public void method2() {
		System.out.println("CompareA:����");
	}
	
}