package com.linhan.bai.day17;

public class Man extends Father implements Filial, Spoony {

	/*
	 * @Override public void help() { System.out.println("ÎÒ¸Ã¸ÉÊ²Ã´£¿£¿"); }
	 */
	
}

class Father{
	public void help() {
		System.out.println("ÄãÒª³Ô³Ô³Ô!!");
	}
}

interface Filial{
	default void help() {
		System.out.println("³Ô³Ô³Ô!!");
	}
}

interface Spoony{
	default void help() {
		System.out.println("Ë¯Ë¯Ë¯!!");
	}
}
