package com.linhan.bai.day18;

public class InnerClassTest1 {
	
	//�������ټ�
	public void method() {
		//�ֲ��ڲ���
		class AA{
			
		}
	}
	
	//����һ��ʵ����Comparable�ӿڵ���Ķ���
	public Comparable getComparable() {
		
		//����һ��ʵ����Comparable�ӿڵ���:�ֲ��ڲ���
		class MyComparable implements Comparable{

			@Override
			public int compareTo(Object o) {
				return 0;
			}
			
		}
		return new MyComparable();
	}
	
	//method2
	public Comparable getComparable2() {
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				return 0;
			}
		};
	}

}
