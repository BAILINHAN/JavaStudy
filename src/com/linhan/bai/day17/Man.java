package com.linhan.bai.day17;

public class Man extends Father implements Filial, Spoony {

	/*
	 * @Override public void help() { System.out.println("�Ҹø�ʲô����"); }
	 */
	
}

class Father{
	public void help() {
		System.out.println("��Ҫ�ԳԳ�!!");
	}
}

interface Filial{
	default void help() {
		System.out.println("�ԳԳ�!!");
	}
}

interface Spoony{
	default void help() {
		System.out.println("˯˯˯!!");
	}
}
