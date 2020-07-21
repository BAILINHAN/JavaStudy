package com.linhan.bai.day11;

import java.util.Scanner;
import java.util.Vector;

/**
 * 
 * 使用Vector代替数组处理，从键盘读入学生成绩，以负数代表输入结束，找出最高分，并输出学生等级。
 * 一旦使用数组，就要提前知道数组的长度，因为数组的长度不能改变
 * 而向量类java.util.Vector可以根据需要动态伸缩
 * 
 * 创建Vector对象：Vector v = new Vector();
 * 给向量添加元素：v.addElement(Object obj); //obj必须为对象
 * 取出向量中的元素：Object obj = v.elementAt(0);
 * 注意第一个元素的下标为0，返回值类型是Object类型的
 * 计算向量的长度：v.size()
 * 若与最高分相差10分以内：A等；20分内：B等；30分内：C等；其他：D等
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月3日下午10:53:37
 */
public class ScoreTest {
	
	public static void main(String[] args) {
		//实例化Scanner，用于键盘获取学生成绩
		Scanner sc = new Scanner(System.in);
		//创建Vector对象：Vector v = new Vector();相当于原来的数组
		Vector v = new Vector();
		//for(;;)或while(true)的方式，给Vector中添加数据
		int maxScore = 0;
		for (;;) {
			System.out.println("请输入学生成绩(负数表示输入结束)");
			int score = sc.nextInt();
			//Jdk5.0之前，先转换为Integer，再进行添加
			//当输入为负数时，跳出循环
			if(score < 0) {
				break;
			}
			if(score > 100) {
				System.out.println("输入的数据非法，请重新输入！");
				continue;
			}
			Integer inScore = new Integer(score);
			//v.addElement(Obj obj)
			//v.addElement(inScore);
			v.addElement(score);//自动装箱
			//获取学生成绩的最大值
			if(maxScore < score) {
				maxScore = score;
			}
		}
		char level;
		//遍历Vector得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);
			//转化为基本数据类型
			Integer inScore = (Integer)obj;
			int score = inScore.intValue();
			if((maxScore - score) <= 10){
				level = 'A';
			}else if(maxScore - score <= 20) {
				level = 'B';
			}else if(maxScore - score <= 30){
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("Student-" + i + "score is " + score +",grade is " + level);
		}
		
		
		
		
	}

}
