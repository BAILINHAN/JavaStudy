package com.linhan.bai.day15;
/**
 * ����SalariedEmployee�ඨ��HourlyEmployee�࣬ʵ�ְ�Сʱ���㹤�ʵ�Ա������
 * ���������private��Ա����wage��hour;
 * 	ʵ�ָ���ĳ��󷽷�earnings()����wage*hour��ֵ
 * toString()�������Ա��������Ϣ�Լ�Ա����name,number,birthday
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��18������12:10:40
 */
public class HourlyEmployee extends Employee{

	private int wage;//ÿСʱ�Ĺ���
	private int hour;//�¹���Сʱ��
	
	public HourlyEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}
	
	public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public int earnings() {
		return wage * hour;
	}
	
	public String toString() {
		return "HourlyEmployee[" + super.toString() + "]";
	}

}
