package com.yedam.object;

class Person {//클래스의 속성을 나타내는 예제 
	
	//클래스의 속성 : 필드 = 정보를 담을수 있는것
	private String name;
	private int age;

	//클래스의 기능 : 메소드 : 기능 무언가를하는거
	void setName(String name) {
		this.name = name;
	}
	Person(){
		name = "기본값";
		age = 0;
	}
	
	 Person(String name , int age){//매개값을 통해 값을 주고 싶다 할땐 이렇게 생성자를 직접 호출해서 사용
		this.name = name;
		this.age = age;
	}
	String getName() {
		return this.name;
	}

	void setAge(int age) {
		if (age < 0) {
			this.age = 10;
		} else {
			this.age = age;
		}
	}
	int getAge() {
		return this.age;
	}

//또 다른 기능을 하는 매소드를 만들고싶다
// 이름과 나이를 말해주는 메소드
	void showInfo() {
		System.out.printf("이름은 %s 이고 나이는 %d입니다.",name,age);
	}
	void yearAfter(int year) {
		System.out.printf("이름은 %s이고 %d년 후에는 %d살 입니다. \n",name,year,age+year);
	}

}



//private 필드를 직접 외부에서 바꾸거나 할수없게 함
//메소드를 이용해서 값을 저장하거나 불러오겠습니다
public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person();//클래스 필드의 초기값을 지정하기 위해 생성자를 사용
								//person() 매개값이 없는 생성자를 기본생성자라고 한다.
								//생성자안에 직접 넣고싶으면 person();괄호안에직접 넣어줄수있다 
							
		//p1.name = "홍길동";
		p1.setName("홍길동");
//		p1.age = 20;
		p1.setAge(-20);
//		p1.age = -20;
		System.out.println(p1.getName()+","+p1.getAge());
		p1.showInfo();
		p1.yearAfter(4);
	}

}

