package com.linhan.bai.day03;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer("уехЩ",1);
//		customer.setId(1);
		System.out.println("Id: "+customer.getId()+"\n"+"name: "+customer.getName());
	}

}
