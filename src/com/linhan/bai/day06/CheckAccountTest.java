package com.linhan.bai.day06;

public class CheckAccountTest {
	
	public static void main(String[] args) {
		CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
		checkAccount.withdraw(5000);
		System.out.println("�����˻����Ϊ:"+checkAccount.getBalance()+"\n���Ŀ�͸֧���Ϊ:"+checkAccount.getOverdraft());
		checkAccount.withdraw(18000);
		System.out.println("�����˻����Ϊ:"+checkAccount.getBalance()+"\n���Ŀ�͸֧���Ϊ:"+checkAccount.getOverdraft());
		checkAccount.withdraw(3000);
		System.out.println("�����˻����Ϊ:"+checkAccount.getBalance()+"\n���Ŀ�͸֧���Ϊ:"+checkAccount.getOverdraft());
	}

}
