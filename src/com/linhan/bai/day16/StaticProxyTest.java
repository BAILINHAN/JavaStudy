package com.linhan.bai.day16;

public class StaticProxyTest {
	
	public static void main(String[] args) {
		Proxy s = new Proxy(new RealStar());
		s.confer();
		s.signContract();
		s.bookTicket();
		s.sing();
		s.collectMoney();
	}

}

interface Star{
	void confer();//��̸
	
	void signContract();//ǩ��ͬ
	
	void bookTicket();//��Ʊ
	
	void sing();//����
	
	void collectMoney();//��Ǯ
	
}

class RealStar implements Star{

	public void confer() {
		
	}

	public void signContract() {
		
	}

	public void bookTicket() {
		
	}

	public void sing() {
		System.out.println("���ǳ���");
	}

	public void collectMoney() {
		
	}
	
}

//������
class Proxy implements Star{
	
	private Star real;
	
	public Proxy(Star real) {
		this.real = real;
	}

	public void confer() {
		System.out.println("��������̸");
	}

	public void signContract() {
		System.out.println("������ǩ��ͬ");
	}

	public void bookTicket() {
		System.out.println("�����˶�Ʊ");
	}

	public void sing() {
		real.sing();
	}

	public void collectMoney() {
		System.out.println("��������Ǯ");
	}
	
}
