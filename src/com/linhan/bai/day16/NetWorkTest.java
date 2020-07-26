package com.linhan.bai.day16;
/**
 * �ӿڵ�Ӧ�ã�����ģʽ
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��19������11:13:53
 */
public class NetWorkTest {
	
	public static void main(String[] args) {
		
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
	
	}

}

interface NetWork{
	
	public void browse();
	
}

//��������
class Server implements NetWork{

	public void browse() {
		System.out.println("��ʵ�ķ�������������");
	}
	
}

//������
class ProxyServer implements NetWork{
	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		super();
		this.work = work;
	}

	public void check() {
		System.out.println("����֮ǰ�ļ�鹤��");
	}
	
	public void browse() {
		check();
		work.browse();
	}
	
}
