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
		System.out.println("我想嫁给:"+boy.getName());
		boy.marry(this);
	}
	
	/**
	 * 
	 * @author ZhangShengjie
	 *
	 * @date 2020年5月29日下午11:21:24
	 * @return 正数：当前对象大；负数：当前对象小；0：二者一样 
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
