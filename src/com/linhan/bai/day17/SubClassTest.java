package com.linhan.bai.day17;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//1.�ӿ��ж���ľ�̬������ֻ��ͨ���ӿ�������
		//2.ͨ��ʵ����Ķ��󣬿��Ե��ýӿ��е�Ĭ�Ϸ���
		//���ʵ������д�˽ӿ��е�Ĭ�Ϸ�������ô����ʱ�����õ�����д֮��ķ���
		//3.�������(��ʵ����)�̳еĸ����ʵ�ֵĽӿ���������ͬ��ͬ�����ķ���
		//��ô������û����д�˷���������£�Ĭ�ϵ��õ��Ǹ����е�ͬ�������ķ���--->������ԭ��
		//�ӿں͸���������������������û����д��
		//��������Ĭ�ϵ��ø�����ͬ��ͬ�����ķ���-->������ԭ��
		//4.���ʵ����ʵ���˶���ӿڣ��������ӿ��ж�����ͬ��ͬ�����ķ�����
		//��ô��ʵ����û����д�˷���������£�����--->�ӿڳ�ͻ
		//�����Ҫ��ʵ��������д�˷���
		s.method3();
		
		//�ӿ��ж���ľ�̬������ֻ��ͨ���ӿ�������
		CompareA.method1();
	}
}

class SubClass extends SuperClass implements CompareA, CompareB{
	
	public void method2() {
		System.out.println("CompareA:����");
	}
	
}

class SubClassB extends SuperClass implements CompareA, CompareB{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		CompareA.super.method2();
	}
	
	//���������(��ʵ����)�ķ����е��ø��ࡢ�ӿ��б���д�ķ���
	public void myMethod() {
		method3();
		super.method3();
		//���ýӿڵ��е�Ĭ�Ϸ���
		CompareA.super.method3();
		CompareB.super.method2();
	}
	
}