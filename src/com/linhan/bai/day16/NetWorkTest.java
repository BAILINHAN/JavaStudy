package com.linhan.bai.day16;
/**
 * 接口的应用：代理模式
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月19日下午11:13:53
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

//被代理类
class Server implements NetWork{

	public void browse() {
		System.out.println("真实的服务器访问网络");
	}
	
}

//代理类
class ProxyServer implements NetWork{
	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		super();
		this.work = work;
	}

	public void check() {
		System.out.println("联网之前的检查工作");
	}
	
	public void browse() {
		check();
		work.browse();
	}
	
}
