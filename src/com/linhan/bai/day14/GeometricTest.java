package com.linhan.bai.day14;

public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest geometricTest = new GeometricTest();
		
		Circle circle = new Circle("blue", 1.0, 2.3);
		Circle circle1 = new Circle("red", 1.5, 3.3);
		geometricTest.displayGeometricObject(circle);
		geometricTest.displayGeometricObject(circle1);
		
		boolean isEquals = geometricTest.equalsArea(circle, circle1);
		System.out.println("Circle��Circle1������Ƿ���ȣ�"+isEquals);

		MyRectangle myRectangle = new MyRectangle("black", 10, 5, 8);
		MyRectangle myRectangle1 = new MyRectangle("white", 10, 5, 8);
		geometricTest.displayGeometricObject(myRectangle);
		geometricTest.displayGeometricObject(myRectangle1);
		
		boolean rectangleIsEquals = geometricTest.equalsArea(myRectangle, myRectangle1);
		System.out.println("MyRectangle��MyRectangle1������Ƿ���ȣ�"+rectangleIsEquals);
		
	}
	
	//�ж���������Ƿ����
	public boolean equalsArea(GeometricObject geometricObject, GeometricObject geometricObject1) {
		return geometricObject.findArea() == geometricObject1.findArea();
	}
	
	//��ʾ�������
	public void displayGeometricObject(GeometricObject geometricObject) {
		System.out.println("���Ϊ��"+geometricObject.findArea());
	}

}
