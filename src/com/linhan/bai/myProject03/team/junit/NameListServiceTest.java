package com.linhan.bai.myProject03.team.junit;
/**
 * 对NameListService类的测试
 * 
 * @author ZhangShengjie
 *
 * @date 2020年8月1日下午11:27:13
 */

import org.junit.Test;

import com.linhan.bai.myProject03.team.domain.Employee;
import com.linhan.bai.myProject03.team.service.NameListService;
import com.linhan.bai.myProject03.team.service.TeamException;

public class NameListServiceTest {

	@Test
	public void testGetAllEmployees() {
		NameListService nameListService = new NameListService();
		Employee[] allEmployee = nameListService.getAllEmployee();
		for (int i = 0; i < allEmployee.length; i++) {
			System.out.println(allEmployee[i].toString());
		}
	}
	
	@Test
	public void testGetEmployee() {
		NameListService nameListService = new NameListService();
		int id = 101;
		try {
			Employee employee = nameListService.getEmployee(id);
			System.out.println(employee.toString());
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
