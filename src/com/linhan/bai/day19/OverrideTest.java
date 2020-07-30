package com.linhan.bai.day19;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ������д�Ĺ���֮һ��
 * ������д�ķ����׳����쳣�����ڸ��౻��д�ķ����׳����쳣����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��29������9:07:20
 */
public class OverrideTest {
	
	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		test.display(new SubClass());
	}
	
	public void display(SuperClass s) {
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class SuperClass{
	
	public void method() throws IOException{
		
	}
	
}

class SubClass extends SuperClass{
	
	public void method() throws FileNotFoundException{
		
	}
	
}
