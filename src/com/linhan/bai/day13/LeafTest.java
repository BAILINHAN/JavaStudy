package com.linhan.bai.day13;
/**
 * 总结：由父及子，静态先行
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月11日下午12:23:01
 */
class Root{
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的动态初始化块");
	}
	public Root() {
		System.out.println("Root的无参构造器");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的动态初始化块");
	}
	public Mid() {
		System.out.println("Mid的无参构造器");
	}
	public Mid(String msg) {
		this();
		System.out.println("Mid的带参数构造器，其参数值：" + msg);
	}
}

class Leaf extends Mid{
	static {
		System.out.println("Leaf的静态代码块");
	}
	{
		System.out.println("Leaf的动态代码块");
	}
	public Leaf() {
		super("尚硅谷");
		System.out.println("Leaf的构造器");
	}
}

public class LeafTest {
	
	public static void main(String[] args) {
		new Leaf();
		System.out.println("********");
		new Leaf();
	}

}
