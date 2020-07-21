package com.linhan.bai.day11;

import java.util.Scanner;
import java.util.Vector;

/**
 * 
 * ʹ��Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�����������������ҳ���߷֣������ѧ���ȼ���
 * һ��ʹ�����飬��Ҫ��ǰ֪������ĳ��ȣ���Ϊ����ĳ��Ȳ��ܸı�
 * ��������java.util.Vector���Ը�����Ҫ��̬����
 * 
 * ����Vector����Vector v = new Vector();
 * ���������Ԫ�أ�v.addElement(Object obj); //obj����Ϊ����
 * ȡ�������е�Ԫ�أ�Object obj = v.elementAt(0);
 * ע���һ��Ԫ�ص��±�Ϊ0������ֵ������Object���͵�
 * ���������ĳ��ȣ�v.size()
 * ������߷����10�����ڣ�A�ȣ�20���ڣ�B�ȣ�30���ڣ�C�ȣ�������D��
 * 
 * 
 * @author ZhangShengjie
 *
 * @date 2020��7��3������10:53:37
 */
public class ScoreTest {
	
	public static void main(String[] args) {
		//ʵ����Scanner�����ڼ��̻�ȡѧ���ɼ�
		Scanner sc = new Scanner(System.in);
		//����Vector����Vector v = new Vector();�൱��ԭ��������
		Vector v = new Vector();
		//for(;;)��while(true)�ķ�ʽ����Vector���������
		int maxScore = 0;
		for (;;) {
			System.out.println("������ѧ���ɼ�(������ʾ�������)");
			int score = sc.nextInt();
			//Jdk5.0֮ǰ����ת��ΪInteger���ٽ������
			//������Ϊ����ʱ������ѭ��
			if(score < 0) {
				break;
			}
			if(score > 100) {
				System.out.println("��������ݷǷ������������룡");
				continue;
			}
			Integer inScore = new Integer(score);
			//v.addElement(Obj obj)
			//v.addElement(inScore);
			v.addElement(score);//�Զ�װ��
			//��ȡѧ���ɼ������ֵ
			if(maxScore < score) {
				maxScore = score;
			}
		}
		char level;
		//����Vector�õ�ÿ��ѧ���ĳɼ����������ɼ��Ƚϣ��õ�ÿ��ѧ���ĵȼ�
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);
			//ת��Ϊ������������
			Integer inScore = (Integer)obj;
			int score = inScore.intValue();
			if((maxScore - score) <= 10){
				level = 'A';
			}else if(maxScore - score <= 20) {
				level = 'B';
			}else if(maxScore - score <= 30){
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("Student-" + i + "score is " + score +",grade is " + level);
		}
		
		
		
		
	}

}
