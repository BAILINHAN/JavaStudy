package com.linhan.bai.day06;

public class Account {
	
	private int account;//账号
	private double balance;//余额
	private double annualInterestRate;//年利率
	
	public Account(int account, double balance, double annualInterestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//返回月利率
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	
	//取钱
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("余额不足");
		}
	}
	
	//存钱
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}

}
