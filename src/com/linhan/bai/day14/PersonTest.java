package com.linhan.bai.day14;
/**
 * ���ڳ��������������
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��16������9:29:47
 */
public class PersonTest {
	
	public static void main(String[] args) {
		
		method(new Student());//��������
		
		Woker woker = new Woker();
		method1(woker);//����������������Ķ���
		
		method1(new Woker());//���������������Ķ���
		
		//����һ����������Ķ���p  ֻ����һ��
		Person p = new Person() {
			
			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("�Զ���");
			}
			
			@Override
			public void talk() {
				// TODO Auto-generated method stub
				System.out.println("�úú���");
			}
		};
		
		method1(p);
		
		//���������������������
		method1(new Person() {
			
			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("�ԺóԵĶ���");
			}
			
			@Override
			public void talk() {
				// TODO Auto-generated method stub
				System.out.println("�úú������ʿ���");
			}
		});
		
	
	}
	
	public static void method1(Person p) {
		p.breath();
		p.talk();
	}
	
	public static void method(Student s) {
		
	}

}

class Woker extends Person{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}