package com.linhan.bai.day09;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order(1001, "aa");
		Order order1 = new Order(1001, "bb");
		Order order2 = new Order(1001, "bb");
		
		//��ͨ��new����Stringʱ������Ϊfalse
		//Order order2 = new Order(1001, new String("bb"));
		
		System.out.println(order.equals(order1));
		System.out.println(order2.equals(order1));//��дequals()����Ϊtrue��String�е����ݴ洢�ڳ�������
		
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
	 * �ȽϹ��̵��У��Ƚϵ�����ǻ����������ͣ�ʹ�� == ��ֻҪ�Ƚϵ��������������ͣ���Ҫʹ��equals
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