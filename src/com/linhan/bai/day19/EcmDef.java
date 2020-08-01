package com.linhan.bai.day19;
/**
 * throws是异常处理
 * throw是手动抛出异常，生成异常对象
 * 
 * @author ZhangShengjie
 *
 * @date 2020年7月31日下午12:42:35
 */
public class EcmDef {
	
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int result = ecm(i, j);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("数据类型不一致");
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
		}catch (ArithmeticException e) {
			System.out.println("被除数不能为0");
		}
	}

	public static int ecm(int i, int j) throws EcDef {
		if(i < 0 || j < 0) {
			throw new EcDef("分子或分母为负数了");
		}
		return i / j;
	}
	
}
