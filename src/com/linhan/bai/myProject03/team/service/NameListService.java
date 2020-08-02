package com.linhan.bai.myProject03.team.service;

import com.linhan.bai.myProject03.team.domain.Architect;
import com.linhan.bai.myProject03.team.domain.Designer;
import com.linhan.bai.myProject03.team.domain.Employee;
import com.linhan.bai.myProject03.team.domain.Equipment;
import com.linhan.bai.myProject03.team.domain.NoteBook;
import com.linhan.bai.myProject03.team.domain.PC;
import com.linhan.bai.myProject03.team.domain.Printer;
import com.linhan.bai.myProject03.team.domain.Programmer;

/**
 * 负责将Data中的数据封装到Employee[]数组中,同时提供相关操作Employee[]的方法。
 * 
 * @author ZhangShengjie
 *
 * @date 2020年8月1日下午6:01:24
 */
public class NameListService {
	
	private Employee[] employees;

	/**
	 * 给数组以及数组元素进行初始化
	 */
	public NameListService() {
		super();	
		employees = new Employee[Data.EMPLOYEES.length];
		
		for (int i = 0; i < employees.length; i++) {
			//获取员工的基本类型
			int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
			//获取Employee的四个基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Integer.parseInt(Data.EMPLOYEES[i][4]);
			Equipment equipment;
			double bonus;
			int stock;
			
			switch (type) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			
			case Data.PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			
			case Data.DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			
			case Data.ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;

			}
		}
		
	}

	/**
	 * 获取指定index上的员工的设备
	 * @author ZhangShengjie
	 *
	 * @date 2020年8月1日下午10:44:07
	 */
	private Equipment createEquipment(int index) {
		int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		String model = Data.EQUIPMENTS[index][1];
		switch (type) {
		case Data.PC:
			
			return new PC(model, Data.EQUIPMENTS[index][2]);
		case Data.NOTEBOOK:
			double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
			return new NoteBook(model, price);
		case Data.PRINTER:
			
			return new Printer(model, Data.EQUIPMENTS[index][2]);
		}
		return null;
	}

	/**
	 * 获取当前所有的员工
	 * @author ZhangShengjie
	 *
	 * @date 2020年8月1日下午11:13:57
	 */
	public Employee[] getAllEmployee() {
		return employees;
	}
	
	/**
	 * 
	 * @author ZhangShengjie
	 * @throws TeamException 
	 *
	 * @date 2020年8月1日下午11:16:07
	 */
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		throw new TeamException("找不到指定的员工");
	}
	
}
