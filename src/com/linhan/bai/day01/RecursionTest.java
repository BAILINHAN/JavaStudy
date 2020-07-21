package com.linhan.bai.day01;

import java.math.BigDecimal;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020��5��26������10:29:13
 * 
 * �����ĵݹ�
 */
public class RecursionTest {
	
	//����1-100֮��������Ȼ���ĺ�
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
				sum += i;
		}
		
		RecursionTest re = new RecursionTest();
		System.out.println("100������Ȼ���ĺͣ�"+re.getSum(100));
		System.out.println("100������Ȼ���Ļ���"+re.getProduct(100));
	}

	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	
	public BigDecimal getProduct(int n) {
		BigDecimal bigDecimal = new BigDecimal(n);
		if(n==1) {
			return bigDecimal.setScale(1);
		}else {
			return bigDecimal.multiply(getProduct(n-1));
		}
	}
}
