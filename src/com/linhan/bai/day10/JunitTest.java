package com.linhan.bai.day10;

import org.junit.Test;

/**
 * Java�е�JUnit��Ԫ����
 * ���裺
 * 1.ѡ�е�ǰ���̣�build path --> add libraries --> JUnit ���JUnit��
 * 2.����һ��Java�࣬���е�Ԫ����
 * 	 ��ʱ��Java��Ҫ�󣺢ٴ����ǹ���(public)��  �ڴ���Ҫ�ṩһ���������޲εĹ�����
 * 3.������������Ԫ���Է�����
 * 	 ��ʱ�ĵ�Ԫ���Է�����������Ȩ����public,û�з���ֵ,û���β�
 * 4.�˵�Ԫ���Է�������Ҫ����ע�⣺@Test,���ڵ�Ԫ�������е��룺import org.junit.Test;
 * 5.�����õ�Ԫ���Է����Ժ󣬾Ϳ����ڷ������ڲ�����صĴ��롣
 * 6.д������Ժ����˫����Ԫ���Է��������Ҽ���run as - JUnit Test
 * 
 * ˵����
 * 1.���ִ�н��û���κ��쳣������
 * 2.���ִ�н�������쳣������
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��1������10:02:44
 */
public class JunitTest {
	
	@Test
	public void testEquals() {
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
	}

}
