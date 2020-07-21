package com.linhan.bai.day13;
/**
 * 对属性可以赋值的位置：
 * ① 默认初始化
 * ② 显示初始化   ⑤ 在代码块中赋值  //看谁先写就是谁先执行
 * ③ 构造器中初始化
 * ④ 有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 * 
 * 
 * 执行的先后顺序： ① - ② / ⑤ - ③ - ④ 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月11日下午12:45:16
 */

public class OrderTest {
	
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.orderId);
	}
	
	public void show() {
		System.out.println("show()");
	}
	
	public int show(int a) {
		System.out.println("show(" + a + ")");
		return 0;
	}

}

class Order{
	int orderId = 3;
	
	{
		orderId = 4;
	}
}

