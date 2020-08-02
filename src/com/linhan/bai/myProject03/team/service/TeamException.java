package com.linhan.bai.myProject03.team.service;
/**
 * 自定义异常类:
 * 需要继承于现有的异常类
 * 
 * @author ZhangShengjie
 *
 * @date 2020年8月1日下午11:19:47
 */
public class TeamException extends Exception{
	
	//用来识别唯一的类
	static final long serialVersionUID = -3387523413124229948L;

	public TeamException() {
		super();
	}

	public TeamException(String message) {
		super(message);
	}

}
