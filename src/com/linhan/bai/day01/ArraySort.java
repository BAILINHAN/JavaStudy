package com.linhan.bai.day01;

import java.util.Arrays;

/**
 * @author ZhangShengjie
 *
 * @date 2020-5-14обнГ10:03:19
 */
public class ArraySort {
	
	public static void main(String[] args) {
		int[] originArray = new int[] {-25,-36,25,7,98,145};
		String result = Arrays.toString(sort(originArray));
		System.out.println(result);
		PersonTest person = new PersonTest();
		Person person_A = new Person();
	}
	
	/**
	 * @author ZhangShengjie
	 *
	 * @date 2020-5-14обнГ10:02:24
	 */
	private static int[] sort(int[] originArray){
		for (int i = 0; i < originArray.length-1; i++) {
			for (int j = 0; j < originArray.length-1-i; j++) {
				if(originArray[j]>originArray[j+1]){
					int temp = originArray[j];
					originArray[j] = originArray[j+1];
					originArray[j+1] = temp;
 				}
			}
			
		}
		return originArray;
	}

}
