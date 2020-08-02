package com.linhan.bai.myProject03.team.service;
/**
 * 表示员工的状态
 * 
 * @author ZhangShengjie
 *
 * @date 2020年8月1日下午4:48:27
 */
public class Status {
	
	private final String NAME;
	
	private Status(String name) {
		this.NAME = name;
	}
	
	public static final Status FREE = new Status("FREE");	
	public static final Status BUSY = new Status("BUSY");	
	public static final Status VACATION = new Status("VACATION");

	public String getNAME() {
		return NAME;
	}

	@Override
	public String toString() {
		return NAME;
	}	
	
}
