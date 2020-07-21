package com.linhan.bai.day01;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[20];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].number = i+1;
			students[i].state = (int)(Math.random()*(6-1+1)+1);
			students[i].score = (int)(Math.random()*(100-0+1)+1);
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("学号为:"+students[i].number+" "+"分数为:"+students[i].score+" "+"年级为:"+students[i].state+"\n");
		}
		
		System.out.println("****************************************");
		
		for (int i = 0; i < students.length; i++) {
			if(students[i].state == 3){
				System.out.println("学号为:"+students[i].number+" "+"分数为:"+students[i].score+" "+"年级为:"+students[i].state+"\n");
			}
		}
		
	}

}
class Student{
	int number;
	int state;
	int score;
}
