package com.linhan.bai.day01;

import java.util.Scanner;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020-5-11����8:59:25
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		int[] a = new int [5];
		int[] ids;
		//��̬��ʼ��
		ids = new int[]{1,2,3,4};
		//��̬��ʼ��
		String[] names = new String [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ������");
		int number = sc.nextInt();
		System.out.println("������"+number+"��ѧ���ɼ�");
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
