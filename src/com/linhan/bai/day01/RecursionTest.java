package com.linhan.bai.day01;

import java.math.BigDecimal;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020年5月26日下午10:29:13
 * 
 * 方法的递归
 */
public class RecursionTest {
	
	//计算1-100之间所有自然数的和
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
				sum += i;
		}
		
		RecursionTest re = new RecursionTest();
		System.out.println("100以内自然数的和："+re.getSum(100));
		System.out.println("100以内自然数的积："+re.getProduct(100));
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
