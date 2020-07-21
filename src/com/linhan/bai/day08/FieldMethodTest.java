package com.linhan.bai.day08;

public class FieldMethodTest {
	
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.count);//20
		s.display();//20
		Base b = s;
		// == :�����������������������Ƚϵ������������������͵ĵ�ֵַ�Ƿ���ͬ
		System.out.println(b ==s);//true
		System.out.println(b.count);//10  ���Է��治���ֶ�̬�ԣ��������ж������
		b.display();//20����̬�ԣ�ʵ��ִ�е�����������д�ķ��������Բ����ǣ�����Ϊ˭���͵��õ�˭�����ԣ��������ж�����ߣ�
	}

}

class Base{
	int count = 10;
	
	public void display() {
		System.out.println(this.count);
	}
}

class Sub extends Base{
	int count = 20;
	
	public void display() {
		System.out.println(this.count);
	}
	
}