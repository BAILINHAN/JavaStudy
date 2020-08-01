package com.linhan.bai.day19;
/**
 * throws���쳣����
 * throw���ֶ��׳��쳣�������쳣����
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��31������12:42:35
 */
public class EcmDef {
	
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int result = ecm(i, j);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("�������Ͳ�һ��");
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ȱ�������в���");
		}catch (ArithmeticException e) {
			System.out.println("����������Ϊ0");
		}
	}

	public static int ecm(int i, int j) throws EcDef {
		if(i < 0 || j < 0) {
			throw new EcDef("���ӻ��ĸΪ������");
		}
		return i / j;
	}
	
}
