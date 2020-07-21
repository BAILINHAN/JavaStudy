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

	//自动生成equals()的重写
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
	//手动实现equals()的重写
	//重写的原则：比较两个对象的实体内容（即：name和age）是否相同
	@Override
	public boolean equals(Object obj) {
		System.out.println("Customer中重写的equals()方法");
		if(this == obj) {
			return true;
		}
		if(obj instanceof Customer) {
			Customer customer = (Customer)obj;
			//比较两个对象的每个属性是否都相同
			if(this.age == customer.age && this.name.equals(customer.name)) {
				return true;
			}
		}
		return false;
		
	}
*/
	//自动实现toString()
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
/*
	//手动实现toString()
	@Override
	public String toString() {
		return "Customer[name = "+ name +",age = "+ age + "]";
	}
*/
	
}
