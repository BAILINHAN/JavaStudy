package com.linhan.bai.day13;
/**
 * final�����յ�
 * 
 * 1.final�����������εĽṹ���ࡢ����������
 * 2.final��������һ���ࣺ���಻�ܱ����������̳�
 * 				       ���磺String�ࡢSystem�ࡢStringBuffer��
 * 3.final��������һ�������������˷������ܱ���д
 * 					���磺Object���е�getClass();
 * 4.final��������һ����������ʱ��"����"�ͳ�Ϊ��һ������
 * 					4.1 final�������ԣ����Կ��Ǹ�ֵ��λ���У���ʽ��ʼ����������и�ֵ/��ʼ�����������г�ʼ��
 * 					4.2 final���ξֲ�������
 * 					    ������ʹ��final�����β�ʱ���������β���һ�������������ǵ��ô˷���ʱ���������βθ�һ��ʵ�Ρ�
 * 					  һ����ֵ�Ժ󣬾�ֻ���ڷ�������ʹ�ô��βΣ������ܽ������¸�ֵ��
 *	 static final:�����������ԣ�ȫ�ֳ��� 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��11������12:52:34
 */
public class FinalTest {
	
	final int WIDTH = 10;
	final int LEFT;
	final int RIGHT;
	
	{
		LEFT = 1;
	}
	
	public FinalTest(){
		RIGHT = 2;
	}
	
	public FinalTest(int right) {
		RIGHT = right;
	}
	
	public void doWidth() {
		//��final���ε����Բ����ٱ���ֵ��
		//width = 20;
	}
	
	public void show() {
		final int NUMBER = 10;//����
	}
	
	public int show(final int num) {
		//num = 15; //���벻ͨ��
		System.out.println(num);
		return num + 1;
	}
	
	public static void main(String[] args) {
		FinalTest test = new FinalTest();
		test.show(10);
	}
	
	public void addOne(final Other o) {
		//o = new Other();  //�������
		o.i++;
	}
	
}

//��final���ε��಻����������������
final class FinalA{
	
}

class A{
	public void show() {
		
	}
}

class B extends A{
	public final void show() {
		
	}
}

class Other{
	public int i;
}

