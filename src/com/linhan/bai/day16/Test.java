package com.linhan.bai.day16;

//����ͽӿ�С������
public class Test extends B implements A {
	
	public void pX() {
		//System.out.println(x);//x����ȷ����֪��x�Ǹ����еĻ��ǽӿ��еģ��ӿں͸�����ͬһ����
		System.out.println(super.x);
		System.out.println(A.x);
	}
	
	public static void main(String[] args) {
		new Test().pX();
		
		Integer x = -129;//Integer������-128 ~ 127
		Integer y = -129;
		Integer x1 = 5;
		Integer y1 = 5;
		
		System.out.println(x == y);
		System.out.println(x1 == y1);
		
	}
}

interface A{
	int x = 0;
}

class B{
	int x = 1;
}

/***********************************************************************/
interface Playable{
	void play();
}

interface Bounceable{
	void play();
}

interface Rollable extends Playable, Bounceable{
	
	//interface�������ĳ��������ܱ��޸ģ���Ϊǰ��
	//Ĭ����public static final������
	Ball ball = new Ball("PingPang");
	
}

class Ball implements Rollable{

	private String name;
	
	public String getName() {
		return name;
	}
	
	public Ball(String name) {
		this.name = name;
	}
	
	public void play() {
		//interface�������ĳ��������ܱ��޸ģ���Ϊǰ��
		//Ĭ����public static final������
//		ball = new Ball("Football");
		System.out.println(ball.getName());
	}
	
}