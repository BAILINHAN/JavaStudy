package com.linhan.bai.day16;

public class ComparableCircle extends Circle implements CompareObject {

	public ComparableCircle(double radius) {
		super(radius);
	}
	
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		
		if (o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle)o;
			if (this.getRadius() > c.getRadius()) {
				return 1;
			}else if(this.getRadius() < c.getRadius()) {
				return -1;
			}else {
				return 0;
			}
		}else {
			throw new RuntimeException("������������Ͳ�ƥ��");
		}
		
		//��ʽ������Circle��radius�������ͱ�ΪDouble��װ�࣬���ð�װ���е�compareTo����
		//return this.getRadius().compareTo(c.getRadius);
		
	}

}
