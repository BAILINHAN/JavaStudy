package com.linhan.bai.day15;
/**
 * 抽象类的应用：模板方法的设计模式
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月18日上午11:30:35
 */
public class TemplateTest {
	
	public static void main(String[] args) {
		SubTemplete t = new SubTemplete();
		t.spendTime();
	}
	
}

abstract class Template{
	
	//计算某段代码执行所需要花费的时间
	public void spendTime() {
		
		long start = System.currentTimeMillis();
		code();//不确定的部分，易变的部分
		long end = System.currentTimeMillis();
		System.out.println("花费的时间为：" + (end - start));
		
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
