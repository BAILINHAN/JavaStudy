package com.linhan.bai.day15;
/**
 * ����SalariedEmployee��̳�Employee�ࣻ
 * ʵ�ְ��¼��㹤�ʵ�Ա���������������private��Ա����monthlySalary
 * ʵ�ָ���ĳ��󷽷�earnings(),�÷�������monthlySalary��ֵ
 * toString()�������Ա��������Ϣ�Լ�Ա����name,number,birthday;
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��18������12:02:12
 */
public class SalariedEmployee extends Employee {
	
	private int monthlySalary;//�¹���

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
