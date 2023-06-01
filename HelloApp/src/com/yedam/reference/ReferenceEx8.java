package com.yedam.reference;

import java.util.Scanner;

class Student1{//String 타입과 int 타입 다양한 형태를 가지고있는 클래스를 만듬
	String name ; //학생의 이름
	int engScore;
	int mathScore;
}
public class ReferenceEx8 {

	public static void main(String[] args) {
		//학생 : 이름(String) , 영어점수(int) , 수학점수(int).
		Student1 s1 = new Student1();
		s1.name = "홍길동";
		s1.engScore= 90;
		s1.mathScore=90;
		
		Student1 s2 = new Student1();	
		s2.name = "김길동";
		s2.engScore=85;
		s2.mathScore= 75;
		
		Student1 s3 = new Student1();	
		s3.name = "박길동";
		s3.engScore=83;
		s3.mathScore= 55;
		
		Student1[] students = {s1,s2,s3};
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름을 입력하세요");
		String sName = sc.nextLine();
		boolean run = true;
		for(int i = 0 ; i < students.length;i++) {
			if(students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].engScore);
				System.out.println(students[i].mathScore);
				System.out.println("=================================");
				run = false;
			}
		}if(run=true) {
			System.out.println("학생목록에 없습니다");
			}
		
	}

}
