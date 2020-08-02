package com.linhan.bai.myProject03.team.domain;

public class Architect extends Designer {
	
	private int stock;
	
	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public Architect() {
		super();
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return getDetails() + "\t¼Ü¹¹Ê¦\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
	}
	
}
