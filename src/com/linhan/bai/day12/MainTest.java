package com.linhan.bai.day12;
/**
 * main()������ʹ��˵����
 * 1.main()������Ϊ�������ڳ���
 * 2.main()����Ҳ��һ����ͨ�ľ�̬����
 * 3.main()����Ҳ������Ϊ���ǺͿ���̨�����ķ�ʽ��(֮ǰʹ��Scanner)
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��8������11:34:28
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
