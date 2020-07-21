package com.linhan.bai.day15;
/**
 * 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。
 * 该类包括：private成员变量wage和hour;
 * 	实现父类的抽象方法earnings()返回wage*hour的值
 * toString()方法输出员工类型信息以及员工的name,number,birthday
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月18日下午12:10:40
 */
public class HourlyEmployee extends Employee{

	private int wage;//每小时的工资
	private int hour;//月工作小时数
	
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
