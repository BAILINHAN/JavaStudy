package com.linhan.bai.day04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class EclipseKeys {
	
	final double PROJECT_ACCOUNT_ID = 0;
	
	public static void main(String[] args) {
		
		/*
		 * Ctrl + 1
		 */
		String str = new String();
		int num = 1;
		
		/*
		 * 批量导包
		 * Ctrl + Shift + O
		 * 向下复制一行代码
		 * Ctrl + ↓
		 * 向上复制一行代码
		 * Ctrl + ↑
		 * 删除指定行代码
		 * Ctrl + D
		 * 上下移动代码
		 * Alt + ↑
		 * Alt + ↓
		 * 向下加一空行
		 * Shift + Enter
		 * 向上加一空行
		 * Ctrl + Shift + Enter 
		 * 查看源码
		 * Ctrl + Shift + T
		 * 查看类的继承数结构
		 * Ctrl + T
		 * 反撤销
		 * Ctrl + Y
		 * 整体前移
		 * Shift + Tab
		 * 查看类的结构，搜索指定的方法、属性等
		 * Ctrl + O
		 * 批量修改制定的方法名、类名
		 * Alt + Shift + R
		 * 选中结构大小写切换：变成大写
		 * Ctrl + Shift + X
		 * 选中结构大小写切换：变成小写
		 * Ctrl + Shift + Y
		 * 自动生成Get/Set/构造器方法
		 * Alt + Shift + S
		 * 文件属性信息
		 * Alt + Enter
		 * 变量快速定位查找
		 * Ctrl + K
		 * ****************
		 * 关闭当前窗口
		 * Ctrl + W
		 * 关闭所有窗口
		 * Ctrl + Shift + W
		 * 查看指定接口使用过的地方
		 * Ctrl + Alt + G
		 * 最大化当前的View
		 * Ctrl + M
		 * 
		 */
		
		ArrayList list = new ArrayList();
		HashMap hashMap = new HashMap();
		Date date = new Date();
		boolean empty = hashMap.isEmpty();
		boolean empty_null = hashMap.isEmpty();
		
		
 		
		
	}

}

class User{
	
	private int id;
	private String name;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
