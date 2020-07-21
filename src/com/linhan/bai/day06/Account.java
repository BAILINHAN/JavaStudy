package com.linhan.bai.day06;

public class Account {
	
	private int account;//�˺�
	private double balance;//���
	private double annualInterestRate;//������
	
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
	
	//����������
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	
	//ȡǮ
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("����");
		}
	}
	
	//��Ǯ
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}

}
