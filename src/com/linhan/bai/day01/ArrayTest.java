package com.linhan.bai.day01;

import java.util.Scanner;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020-5-11下午8:59:25
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		int[] a = new int [5];
		int[] ids;
		//静态初始化
		ids = new int[]{1,2,3,4};
		//动态初始化
		String[] names = new String [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生个数");
		int number = sc.nextInt();
		System.out.println("请输入"+number+"个学生成绩");
		int[] scores = new int[number];
		int maxScore = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			if(scores[i]>maxScore){
				maxScore = scores[i];
			}
		}
		System.out.println(maxScore);
		sc.close();
		
	}

}
