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
			throw new RuntimeException("传入的数据类型不匹配");
		}
		
		//方式二：将Circle中radius属性类型变为Double包装类，调用包装类中的compareTo方法
		//return this.getRadius().compareTo(c.getRadius);
		
	}

}
