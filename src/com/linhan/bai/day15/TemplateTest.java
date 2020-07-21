package com.linhan.bai.day15;
/**
 * �������Ӧ�ã�ģ�巽�������ģʽ
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��18������11:30:35
 */
public class TemplateTest {
	
	public static void main(String[] args) {
		SubTemplete t = new SubTemplete();
		t.spendTime();
	}
	
}

abstract class Template{
	
	//����ĳ�δ���ִ������Ҫ���ѵ�ʱ��
	public void spendTime() {
		
		long start = System.currentTimeMillis();
		code();//��ȷ���Ĳ��֣��ױ�Ĳ���
		long end = System.currentTimeMillis();
		System.out.println("���ѵ�ʱ��Ϊ��" + (end - start));
		
	}
	
	public abstract void code();
	
}

class SubTemplete extends Template{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		for (int i = 2; i < 1000; i++) {
			boolean isFlage = true;
			for (int j = 2; j < Math.sqrt(i); j++) {
				if(i%j == 0) {
					isFlage = false;
					break;
				}
			}
			if(isFlage) {
				System.out.println(i);
			}
		}
		
	}

}
