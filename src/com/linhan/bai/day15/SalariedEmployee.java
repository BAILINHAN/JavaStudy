package com.linhan.bai.day15;
/**
 * 定义SalariedEmployee类继承Employee类；
 * 实现按月计算工资的员工处理。该类包括：private成员变量monthlySalary
 * 实现父类的抽象方法earnings(),该方法返回monthlySalary的值
 * toString()方法输出员工类型信息以及员工的name,number,birthday;
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月18日下午12:02:12
 */
public class SalariedEmployee extends Employee {
	
	private int monthlySalary;//月工资

	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}
	
	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public int earnings() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	
	public String toString() {
		return "SalariedEmployee[" + super.toString() + "]";
	}

}
