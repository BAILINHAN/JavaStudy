package com.linhan.bai.day06;

public class CheckAccount extends Account {

	private double overdraft;//可透支限额
	
	public CheckAccount(int account, double balance, double annualInterestRate,double overdraft) {
		super(account, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	
	
	public double getOverdraft() {
		return overdraft;
	}



	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}



	@Override
	public void withdraw(double amount) {
		if(getBalance() > amount) {
			setBalance(getBalance() - amount);
		}else if(overdraft >= (amount - getBalance())) { //透支额度+余额足够消费
			overdraft -= (amount - getBalance());
			super.withdraw(getBalance());
		}else {
			System.out.println("超过可透支限额！");
		}
	}

}
