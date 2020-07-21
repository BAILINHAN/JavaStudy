package com.linhan.bai.day15;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用
 * 利用循环结构遍历数组元素，输出各个对象类型，name，number，birthday
 * 当键盘输出本月月份值时间，如果本月是某个Employee对象的生日，还要输出增加工资+100信息
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月18日下午12:31:47
 */
public class PayrollSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入当月月份：");
		int month = sc.nextInt();
		
		//日期相关的KPI:
		Calendar calendar = Calendar.getInstance();
		int autoMonth = calendar.get(Calendar.MONTH);//获取当前的月份
		autoMonth ++ ;
		System.out.println("当前月份:" + autoMonth);
		
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28),10000);
		emps[1] = new HourlyEmployee("张三", 2001, new MyDate(1993, 7, 1),60,240);
		
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i]);
			int salary = emps[i].earnings();
			System.out.println("月工资为：" + salary);
			
			if(month == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励100元");
			}
			
		}
		
	}
	
}
