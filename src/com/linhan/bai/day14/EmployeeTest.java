package com.linhan.bai.day14;

public class EmployeeTest {
	
	public static void main(String[] args) {
	
		Employee manager = new Manager("���", 1001, 5000, 50000);
		
		manager.work();
	
		//��̬
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
		
		
	}

}
