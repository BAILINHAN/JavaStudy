package com.linhan.bai.day06;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account = new Account(111222, 20000, 0.045);
		account.withdraw(30000);
		System.out.println("�����˻����Ϊ:"+account.getBalance());
		account.withdraw(2500);
		System.out.println("�����˻����Ϊ:"+account.getBalance());
		account.deposit(3000);
		System.out.println("�����˻����Ϊ:"+account.getBalance());
		
		System.out.println("������Ϊ:"+(account.getMonthlyInterest()*100)+"%");
		
	}
	

}
