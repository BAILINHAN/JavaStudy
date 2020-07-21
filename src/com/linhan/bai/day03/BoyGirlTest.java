package com.linhan.bai.day03;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("罗密欧",21);
		boy.shout();
		
		Girl girl = new Girl("朱丽叶",18);
		girl.marry(boy);
		
		Girl girl_1 = new Girl("祝英台", 19);
		int compare = girl.compare(girl_1);
		if(compare > 0) {
			System.out.println(girl.getName() + "大");
		}else if(compare < 0) {
			System.out.println(girl_1.getName() + "大");
		}else {
			System.out.println(girl.getName()+"和"+girl_1.getName()+"一样大");
		}
	}

}
