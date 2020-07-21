package com.linhan.bai.day07;

/**
 * �����������֮������̬��(������̬)
 * 
 * ����̬�ԣ��������Ϊһ������Ķ�����̬
 * 
 * ��Ϊ��̬�ԣ�
 * 		����Ķ�̬�ԣ����������ָ������Ķ��󣨻�����Ķ��󸳸���������ã�
 * 
 * ��̬��ʹ�ã����ⷽ������
 * ���˶���Ķ�̬���Ժ������ڱ����ڣ�ֻ�ܵ��ø����������ķ���������ִ���ڣ�����ʵ��ִ�е���������д����ķ���
 * ���뿴��ߣ�ִ�п��ұߣ�ֻ�����ڷ����������������ԣ�
 * 
 * ��̬�Ե�ʹ��ǰ�᣺�� ��ļ̳й�ϵ  �� Ҫ�з�������д  
 * 
 * ����Ķ�̬�ԣ�ֻ�����ڷ����������������ԣ���������ж�����ߣ�
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��21������1:02:18
 */
public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		/*****************����Ķ�̬��****************/
		//һ�����������˶�����̬������Ķ�̬�ԣ����������ָ������Ķ���	
		Person person2 = new Man();
		Person person3 = new Women();
		//��̬��ʹ�ã��������Ӹ���ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е���������д����ķ���----���ⷽ������
		person2.eat();
		person3.eat();
		
		//idΪ1001;
		System.out.println(person2.id);
		
		/*���˶���Ķ�̬��֮���ڴ���ʵ�����Ǽ�������������е����Ժͷ����ģ�
		�������ڱ�������Ϊ�������ͣ����±���ʱֻ�ܵ��ø��������������Ժͷ���*/
		//��β��ܵ����������е����Ժͷ�����--->ʹ��ǿ������ת����������ת�ͣ�
		Man m1 = (Man)person2;		
		m1.isSmoking = true;
		m1.earnMoney();
		
		//ʹ��ǿתʱ�����ܳ���ClassCastException���쳣
//		Women w1 = (Women)person2;
//		w1.goShopping();
		//Ϊ�˱���������������⣬������instanceof�ؼ���
		/**
		 * instanceof�ؼ��ֵ�ʹ��
		 * a instanceof A:�ж϶���a�Ƿ�����A��ʵ��������ǣ�����true��������ǣ�����false��
		 * Ϊ�˱���������ת��ʱ����ClassCastException���쳣��������ת��֮ǰ���Ƚ���instanceof���ж�
		 * һ������Ϊtrue���ͽ�������ת�ͣ��������false���Ͳ���������ת�͡�
		 * 
		 * ��� a instanceof A ����true��a instanceof B Ҳ����true������B����A�ĸ��ࡣ
		 * 
		 * 
		 */
		if(person2 instanceof Women) {
			System.out.println("***Women***");
			Women w = (Women)person2;
			w.goShopping();
		}else if(person2 instanceof Man) {
			System.out.println("***Man***");
			Man m = (Man)person2;
			m.earnMoney();
		}
		if(person2 instanceof Person) {
			System.out.println("Person��Man�ĸ���");
		}
		//�������������ת�ͣ���Ϊ�������û������������еĹ���
		//����һ��
		Person person4 = new Person();
		Man m = (Man)person4;
		//��������
		Person person5 = new Women();
		Man m2 = (Man)person5;
		
		//�������ж�ͨ��
		Object object = new Women();
		Person person6 = (Person)object;

		//���벻ͨ���������ұ�Ϊ��ߵ�����ſ��Ը�ֵ��
//		Man man = new Women();
		
	}

}
