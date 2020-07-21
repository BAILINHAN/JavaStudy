package com.linhan.bai.day06;

public class CheckAccount extends Account {

	private double overdraft;//��͸֧�޶�
	
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
		}else if(overdraft >= (amount - getBalance())) { //͸֧���+����㹻����
			overdraft -= (amount - getBalance());
			super.withdraw(getBalance());
		}else {
			System.out.println("������͸֧�޶");
		}
	}

}
