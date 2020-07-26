package com.linhan.bai.day16;
/**
 * 定义接口实现两个对象比较大小
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月25日上午11:52:07
 */
public interface CompareObject {
	//返回值为0，代表相等；正数代表当前对象大，负数代表当前对象小。
	public int compareTo(Object o);

}
