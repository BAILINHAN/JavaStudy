package com.linhan.bai.day14;

public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest geometricTest = new GeometricTest();
		
		Circle circle = new Circle("blue", 1.0, 2.3);
		Circle circle1 = new Circle("red", 1.5, 3.3);
		geometricTest.displayGeometricObject(circle);
		geometricTest.displayGeometricObject(circle1);
		
		boolean isEquals = geometricTest.equalsArea(circle, circle1);
		System.out.println("Circle和Circle1的面积是否相等："+isEquals);

		MyRectangle myRectangle = new MyRectangle("black", 10, 5, 8);
		MyRectangle myRectangle1 = new MyRectangle("white", 10, 5, 8);
		geometricTest.displayGeometricObject(myRectangle);
		geometricTest.displayGeometricObject(myRectangle1);
		
		boolean rectangleIsEquals = geometricTest.equalsArea(myRectangle, myRectangle1);
		System.out.println("MyRectangle和MyRectangle1的面积是否相等："+rectangleIsEquals);
		
	}
	
	//判断两个面积是否相等
	public boolean equalsArea(GeometricObject geometricObject, GeometricObject geometricObject1) {
		return geometricObject.findArea() == geometricObject1.findArea();
	}
	
	//显示对象面积
	public void displayGeometricObject(GeometricObject geometricObject) {
		System.out.println("面积为："+geometricObject.findArea());
	}

}
