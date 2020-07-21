package com.linhan.bai.day13;
/**
 * �ܽ᣺�ɸ����ӣ���̬����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��11������12:23:01
 */
class Root{
	static {
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root�Ķ�̬��ʼ����");
	}
	public Root() {
		System.out.println("Root���޲ι�����");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid�Ķ�̬��ʼ����");
	}
	public Mid() {
		System.out.println("Mid���޲ι�����");
	}
	public Mid(String msg) {
		this();
		System.out.println("Mid�Ĵ������������������ֵ��" + msg);
	}
}

class Leaf extends Mid{
	static {
		System.out.println("Leaf�ľ�̬�����");
	}
	{
		System.out.println("Leaf�Ķ�̬�����");
	}
	public Leaf() {
		super("�й��");
		System.out.println("Leaf�Ĺ�����");
	}
}

public class LeafTest {
	
	public static void main(String[] args) {
		new Leaf();
		System.out.println("********");
		new Leaf();
	}

}
