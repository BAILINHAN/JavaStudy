package com.linhan.bai.day19;

public class StudentTest {
	
	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}

class Student{
	
	private int id;
	
	public void regist(int id) throws Exception {
		if(id > 0) {
			this.id = id;
		}else {
//			System.out.println("����������ݷǷ���");
			//�ֶ��׳��쳣
//			throw new RuntimeException("����������ݷǷ���");
			throw new MyException("�������븺��");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}
