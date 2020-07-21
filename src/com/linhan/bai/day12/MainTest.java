package com.linhan.bai.day12;
/**
 * main()方法的使用说明：
 * 1.main()方法作为程序的入口出现
 * 2.main()方法也是一个普通的静态方法
 * 3.main()方法也可以作为我们和控制台交互的方式。(之前使用Scanner)
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月8日下午11:34:28
 */

public class MainTest {
	public static void main(String[] args) {
		Main.main(new String[100]);
		//MainTest mainTest = new MainTest();
		//mainTest.show();
		show();
	}
	
	public static void show() {
		
	}
	
}

class Main{
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			args[i] = "args_" + i;
			System.out.println(args[i]);
		}
	}
}
