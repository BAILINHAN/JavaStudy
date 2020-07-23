package com.linhan.bai.day16;

//父类和接口小面试题
public class Test extends B implements A {
	
	public void pX() {
		//System.out.println(x);//x不明确，不知道x是父类中的还是接口中的，接口和父类是同一级别。
		System.out.println(super.x);
		System.out.println(A.x);
	}
	
	public static void main(String[] args) {
		new Test().pX();
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
	
	//interface中声明的常量都不能被修改，因为前面
	//默认有public static final的修饰
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
		//interface中声明的常量都不能被修改，因为前面
		//默认有public static final的修饰
//		ball = new Ball("Football");
		System.out.println(ball.getName());
	}
	
}