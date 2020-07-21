package com.linhan.bai.day03;

public class Girl {
	
	private String name;
	private int age;
	
	public Girl(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void marry(Boy boy) {
		System.out.println("����޸�:"+boy.getName());
		boy.marry(this);
	}
	
	/**
	 * 
	 * @author ZhangShengjie
	 *
	 * @date 2020��5��29������11:21:24
	 * @return ��������ǰ����󣻸�������ǰ����С��0������һ�� 
	 */
	public int compare(Girl girl) {
		if(this.age > girl.age) {
			return 1;
		}else if(this.age <girl.age) {
			return -1;
		}else {
			return 0;
		}
	}

}
