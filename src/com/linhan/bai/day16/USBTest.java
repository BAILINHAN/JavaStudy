package com.linhan.bai.day16;
/**
 * �ӿڵ�ʹ��
 * 1.�����˽ӿڵĶ�̬�ԣ������̬��
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��19������11:18:21
 */
public class USBTest {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		//�����˽ӿڵķ�����ʵ����ķ���������
		Flash flash = new Flash();
		computer.transferData(flash);
		
		//����ʵ���࣬�����˷�����ʵ�������������
		computer.transferData(new Printer());
		
		//�����ӿڵ�����ʵ����ķ���������
		USB phone = new USB() {

			public void start() {
				System.out.println("�ֻ���ʼ����");
			}

			public void stop() {
				System.out.println("�ֻ��������� ");
			}
			
		};
		computer.transferData(phone);
		
		//�����ӿڵ�����ʵ�������������
		computer.transferData(new USB() {

			public void start() {	
				System.out.println("Mp3��ʼ����");
			}

			public void stop() {
				System.out.println("Mp3��������");
			}
			
		});
		
	}

}

class Computer{
	
	public void transferData(USB usb) {
		usb.start();
		System.out.println("���崫�����ݵ�ϸ��");
		usb.stop();
	}
	
}

interface USB{
	//�����˳����������С�Ĵ����ٶȵ�
	
	void start();
	
	void stop();
	
}

class Flash implements USB{

	public void start() {
		System.out.println("U�̿�ʼ����");
	}

	public void stop() {
		System.out.println("U�̽�������");
	}
	
}

class Printer implements USB{

	public void start() {
		System.out.println("��ӡ����ʼ����");
	}

	public void stop() {
		System.out.println("��ӡ����������");
	}
	
}
