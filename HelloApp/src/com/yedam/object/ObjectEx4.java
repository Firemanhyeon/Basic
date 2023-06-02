package com.yedam.object;

//member에 추가적으로 가족정보 person등록한다.
public class ObjectEx4 {
	public static void main(String[] args) {

		Person[] families = { new Person("아버지", 60), new Person("어머니", 55), new Person("동생", 20) };

		Member m1 = new Member();// 비어있는 초기값 객체 생성
		m1.memberId = "user1";
		m1.memberName = "홍길동";
		m1.point = 1000;

		m1.families = families;
		m1.families[0].getName();// 아버지정보
		m1.families[0].getAge();

		Member m2 = new Member();

		Member[] members = new Member[10];
		members[0] = m1;
		members[1] = m2;

		for (int i = 0; i < members.length; i++) {
			String name = members[i].families[0].getName();
		}

	}
}
