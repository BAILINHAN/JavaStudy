package com.linhan.bai.day19;
/**
 * ����Զ����쳣�ࣿ
 * 1.�̳������е��쳣�ṹ��RuntimeException��Exception
 * 2.�ṩȫ�ֳ�����serialVersionUID
 * 3.�ṩ���صĹ�����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��29������6:14:18
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
