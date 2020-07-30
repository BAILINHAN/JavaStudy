package com.linhan.bai.day19;
/**
 * 如何自定义异常类？
 * 1.继承于现有的异常结构：RuntimeException、Exception
 * 2.提供全局常量：serialVersionUID
 * 3.提供重载的构造器
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月29日下午6:14:18
 */
public class MyException extends RuntimeException {
	
	static final long serialVersionUID = -7034897190745766939L;

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}

}
