package com.linhan.bai.day03;
/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020��5��29������10:01:43
 * 
 * JavaBean��һ��Java����д�ɵĿ����������
 * ��νJavaBean����ָ�������±�׼��Java�ࣺ
 * >���ǹ�����
 * >��һ���޲εĹ����Ĺ�����
 * >�����ԡ����ж�Ӧ��get��set����
 * 
 * ����ķ����л���Ĺ������У�����ʹ��this.���Ի�this.�����ķ�ʽ�����õ�ǰ�������ڴ����Ķ��������\��������һ�㶼ʡ��this.
 * ��������£�����������βκ��������ͬ��ʱ������Ҫ��ʽ��ʹ�á�this.�������ķ�ʽ����������Ϊ���ԣ������β�
 * this���Ϊ����ǰ�����ǰ���ڴ����Ķ���
 * 
 * �涨��"this(�β��б�)"���������ڵ�ǰ������������
 * �������в���ͨ��"this(�β��б�)"��ʽ�����Լ�
 * 
 */
public class Customer {
	
	 private int id;
	 private String name;
	
	 public Customer(int id) {
		 this.id = id;
		 System.out.println("�ӹ�ִ�й�40�д���......");
	 }	
	 
	 public Customer(String name, int id) {
		 this(id);
		 this.name = name;
	 }
	 
	 public void setId(int id) {
		 this.id = id;
	 }

	 public int getId() {
		 return id;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
}
