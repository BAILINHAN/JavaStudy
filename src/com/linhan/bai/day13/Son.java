package com.linhan.bai.day13;

public class Son extends Father {

	static {
		System.out.println("444");
	}
	{
		System.out.println("555");
	}
	
	public Son() {
		System.out.println("666");
	}
	
	public static void main(String[] args) {
		System.out.println("777");
		System.out.println("********");
		new Son();
		System.out.println("********");
		
		new Son();
		System.out.println("********");
		new Father();
	}
	
}

class Father{
	static {
		System.out.println("111");
	}
	{
		System.out.println("222");
	}
	
	public Father() {
		System.out.println("333");
	}
	
}
