package com.linhan.bai.myProject03.team.domain;

public class Designer extends Employee {
	
	private double bonus;//½±½ð

	public Designer(int id, String name, int age, double salary, double bonus) {
		super(id, name, age, salary);
		this.bonus = bonus;
	}

	public Designer() {
		super();
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
