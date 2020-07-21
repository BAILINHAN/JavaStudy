package com.linhan.bai.day09;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order(1001, "aa");
		Order order1 = new Order(1001, "bb");
		Order order2 = new Order(1001, "bb");
		
		//当通过new创造String时，返回为false
		//Order order2 = new Order(1001, new String("bb"));
		
		System.out.println(order.equals(order1));
		System.out.println(order2.equals(order1));//重写equals()返回为true，String中的内容存储在常量池中
		
		String s1 = "BB";
		String s2 = "BB";
		System.out.println(s1 == s2);//true
		
	}
	
}

class Order{
	private int orderId;
	private String orderName;
	
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	/**
	 * 比较过程当中，比较的如果是基本数据类型，使用 == ，只要比较的是引用数据类型，就要使用equals
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Order) {
			Order order = (Order)obj;
			if(this.orderId == order.orderId && this.orderName.equals(order.orderName)) {
				return true;
			}
		}
		return false;
	}
}