package com.yedam.reference;
//복합적인데이터를담을수있는구조 
class Student{
	String name;
	int age;
}

public class ReferenceEx1 {

	public static void main(String[] args) {
		//기본 데이터 타입
		int age = 25;
		double price = 100.5;
		
		
		//클래스 , 참조타입
		String name = new String("홍길동");
		String name1 =new String("김길동");
		name1 =name;
//		System.out.println("name: "+name+",name1: "+name1);
		String hobby = "독서";		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		
		Student s2 = s1;
		s1.name = "김길동";//참조변수 s2의 값도 같이 김길동으로 바뀐다 
		s1.age = 22;//s2를 바꿔도 s1 이 바뀜
		System.out.println(s1.name +","+s2.name);
	}

}
