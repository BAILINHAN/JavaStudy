package com.linhan.bai.day14;

public class EmployeeTest {
	
	public static void main(String[] args) {
	
		Employee manager = new Manager("¿â¿Ë", 1001, 5000, 50000);
		
		manager.work();
	
		//¶àÌ¬
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
		
		
	}

}
