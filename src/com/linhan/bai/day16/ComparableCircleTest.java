package com.linhan.bai.day16;

public class ComparableCircleTest {
	
	public static void main(String[] args) {
		
		ComparableCircle c1 = new ComparableCircle(3.4);
		ComparableCircle c2 = new ComparableCircle(3.6);
		
		int compareValue = c1.compareTo(c2);
		if(compareValue > 0) {
			System.out.println("c1��");
		}else if(compareValue < 0) {
			System.out.println("c2��");
		}else {
			System.out.println("��������һ����");
		}
		
		c1.compareTo(new String("Circle"));
		
	}

}
