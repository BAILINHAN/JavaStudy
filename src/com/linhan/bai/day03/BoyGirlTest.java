package com.linhan.bai.day03;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("����ŷ",21);
		boy.shout();
		
		Girl girl = new Girl("����Ҷ",18);
		girl.marry(boy);
		
		Girl girl_1 = new Girl("ףӢ̨", 19);
		int compare = girl.compare(girl_1);
		if(compare > 0) {
			System.out.println(girl.getName() + "��");
		}else if(compare < 0) {
			System.out.println(girl_1.getName() + "��");
		}else {
			System.out.println(girl.getName()+"��"+girl_1.getName()+"һ����");
		}
	}

}
