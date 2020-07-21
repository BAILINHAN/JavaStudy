package com.linhan.bai.day05;

public class Kids extends ManKind {
	
	private int yearsOld;
	
	public Kids() {
		
	}
	
	public Kids(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public void printAge() {
		System.out.println("yearsOld:"+yearsOld);
	}
	
	public void employeed() {
		System.out.println("Kids should study and no job.");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	} 

}
