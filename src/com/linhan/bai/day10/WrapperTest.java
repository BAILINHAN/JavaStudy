package com.linhan.bai.day10;

import org.junit.Test;

/**
 * ��װ���ʹ�ã�
 * 1.Java�ṩ��8�ֻ����������Ͷ�Ӧ�İ�װ�࣬ʹ�û����������͵ı��������������
 * 2.���գ������������ͣ���װ�࣬String����֮����໥ת��
 * 
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��2������9:51:17
 */

public class WrapperTest {
	
	/*
	 * JDK 5.0 �����ԣ��Զ�װ�������
	 */
	@Test
	public void test3() {
		int num1 = 10;
		method(num1);
		
		//�Զ�װ�䣺
		int num2 = 10;
		Integer in1 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		
		//�Զ����䣺��װ��-->������������
		System.out.println(in1.toString());
		
		int num3 = in1;
		boolean b3 = b2;
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	//������������--->��װ�ࣺ���ð�װ��Ĺ�����
	@Test
	public void test1() {
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		Float f1 = new Float(12.56f);
		Float f2 = new Float("12.36");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean("true123");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		//���Դ�СдֻҪ��trueһ���Ϳ���
		System.out.println(b3.toString());
		
		Order order = new Order();
		System.out.println(order.isMale);//false,��Ϊ�ǻ����������ͣ�Ĭ��ֵΪfalse
		System.out.println(order.isFemale);//null,��Ϊ����Boolean��һ�����ˣ�����˵��null
		
	}
	
	//��װ��--->������������:���ð�װ���xxxValue()
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		//ת��Ϊint����
		int i1 = in1.intValue();
		System.out.println(i1+1);
		
		Float fl1 = new Float(12.3);
		float f1 = fl1.floatValue();
		System.out.println(f1+1);
		
	}
	
	//�����������͡���װ��-->String
	@Test
	public void test4() {
		int num1 = 10;
		//��ʽһ������������
		String s1 = 10+"";
		//��ʽ����
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		System.out.println(str2);
		System.out.println(s1);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str3);//"12.4"
		
	}
	
	//String-->�����������͡���װ�ࣺ���ð�װ���parseXxx(String s)
	@Test
	public void test5() {
		String str1 = "123";
		int int1 = Integer.parseInt(str1);
	
		System.out.println(int1 + 1);
		
		String str2 = "tRuE";
		boolean b1 = Boolean.parseBoolean(str2);
		
		System.out.println(b1);
		
	}
	
	@Test
	public void test6() {
		//��Ԫ�������������Ҫͳһ
		Object o1 = true ? new Integer(1) : new Double(1.5);//Integer�����ͻ��Զ�����Ϊdouble����
		System.out.println(o1);//1.0
		Object o3 = new Object();
		Integer in1 = new Integer(1);
		o3 = in1;
		System.out.println(o3);
		System.out.println(in1);
		
		Circle circle = new Circle(1.5);
		System.out.println(circle);
		
		GeometricObject geometricObject = new GeometricObject("blue", 1.5);
		System.out.println(geometricObject);
		
		Object o2;
		if(true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);//1
		
	}
	
	@Test
	public void test7() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		/*
		 * Integer�ڲ�������IntegerCache�ṹ��IntegerCache�ж�����Integer[]�������˴� -128 ~ 127 ��Χ�ڵ�����
		 * ����������Զ�װ��ķ�ʽ����Integer��ֵ�ķ�Χ�� -128 ~ 127 ��Χ��ʱ������ֱ��ʹ�������е�Ԫ�أ��Ͳ���
		 * ��ȥnew�ˡ�Ŀ����Ϊ�����Ч��
		 * 
		 */
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
	
		//128���� -127 ~ 128�ķ�Χ������new����һ���µĵ�ַ���128
		Integer x = 128;//�൱��new��һ��Integer����
		Integer y = 128;
		System.out.println(x == y);//false
		
		Integer num1 = 5;
		Integer num2 = 5;
		System.out.println(num1 == num2);//true
		
		int num3 = 200;
		int num4 = 200;
		System.out.println(num3 == num4);
		
		
	}
	
	

}

class Order{
	boolean isMale;
	Boolean isFemale;
}


