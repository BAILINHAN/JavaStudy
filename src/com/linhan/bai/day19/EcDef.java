package com.linhan.bai.day19;
/**
 * 自定义异常类
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月30日下午5:32:09
 */
public class EcDef extends Exception {
	
	static final long serialVersionUID = -3387516922222229948L;
	
	public EcDef() {
		
	}
	
	public EcDef(String msg) {
		super(msg);
	}

}
