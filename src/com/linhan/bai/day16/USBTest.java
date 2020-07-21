package com.linhan.bai.day16;
/**
 * 接口的使用
 * 1.体现了接口的多态性，满足多态性
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月19日上午11:18:21
 */
public class USBTest {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		//创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		computer.transferData(flash);
		
		//匿名实现类，创建了非匿名实现类的匿名对象
		computer.transferData(new Printer());
		
		//创建接口的匿名实现类的非匿名对象
		USB phone = new USB() {

			public void start() {
				System.out.println("手机开始工作");
			}

			public void stop() {
				System.out.println("手机结束工作 ");
			}
			
		};
		computer.transferData(phone);
		
		//创建接口的匿名实现类的匿名对象
		computer.transferData(new USB() {

			public void start() {	
				System.out.println("Mp3开始工作");
			}

			public void stop() {
				System.out.println("Mp3结束工作");
			}
			
		});
		
	}

}

class Computer{
	
	public void transferData(USB usb) {
		usb.start();
		System.out.println("具体传输数据的细节");
		usb.stop();
	}
	
}

interface USB{
	//定义了长、宽、最大最小的传输速度等
	
	void start();
	
	void stop();
	
}

class Flash implements USB{

	public void start() {
		System.out.println("U盘开始工作");
	}

	public void stop() {
		System.out.println("U盘结束工作");
	}
	
}

class Printer implements USB{

	public void start() {
		System.out.println("打印机开始工作");
	}

	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}
