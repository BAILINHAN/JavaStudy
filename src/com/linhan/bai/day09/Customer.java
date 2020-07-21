package com.linhan.bai.day09;

public class Customer {
	
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//�Զ�����equals()����д
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

/*	
	//�ֶ�ʵ��equals()����д
	//��д��ԭ�򣺱Ƚ����������ʵ�����ݣ�����name��age���Ƿ���ͬ
	@Override
	public boolean equals(Object obj) {
		System.out.println("Customer����д��equals()����");
		if(this == obj) {
			return true;
		}
		if(obj instanceof Customer) {
			Customer customer = (Customer)obj;
			//�Ƚ����������ÿ�������Ƿ���ͬ
			if(this.age == customer.age && this.name.equals(customer.name)) {
				return true;
			}
		}
		return false;
		
	}
*/
	//�Զ�ʵ��toString()
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
/*
	//�ֶ�ʵ��toString()
	@Override
	public String toString() {
		return "Customer[name = "+ name +",age = "+ age + "]";
	}
*/
	
}
