package com.linhan.bai.day15;

import java.util.Calendar;
import java.util.Scanner;

/**
 * ����PayrollSystem�࣬����Employee�������鲢��ʼ�����������Ÿ����Ա���������
 * ����ѭ���ṹ��������Ԫ�أ���������������ͣ�name��number��birthday
 * ��������������·�ֵʱ�䣬���������ĳ��Employee��������գ���Ҫ������ӹ���+100��Ϣ
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��18������12:31:47
 */
public class PayrollSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뵱���·ݣ�");
		int month = sc.nextInt();
		
		//������ص�KPI:
		Calendar calendar = Calendar.getInstance();
		int autoMonth = calendar.get(Calendar.MONTH);//��ȡ��ǰ���·�
		autoMonth ++ ;
		System.out.println("��ǰ�·�:" + autoMonth);
		
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("��ɭ", 1002, new MyDate(1992, 2, 28),10000);
		emps[1] = new HourlyEmployee("����", 2001, new MyDate(1993, 7, 1),60,240);
		
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i]);
			int salary = emps[i].earnings();
			System.out.println("�¹���Ϊ��" + salary);
			
			if(month == emps[i].getBirthday().getMonth()) {
				System.out.println("���տ��֣�����100Ԫ");
			}
			
		}
		
	}
	
}
