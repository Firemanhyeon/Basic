package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member[] members = new Member[3];
		// 등록====================================
		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			boolean dup = false;
			System.out.println("아이디를입력> ");
			String id = sc.nextLine();
			if (i == 0) {
				m1.memberId = id;
			} else if (i != 0) {
				for (int a = 0; a < i; a++) {
					if (id.equals(members[a].memberId)) {
						System.out.println("중복된 아이디값입니다");
						dup = true;
					} else {
						m1.memberId = id;
					}
				}
				if (dup == true) {
					i--;
					continue;
				}
			}

			System.out.println("이름을 입력> ");
			m1.memberName = sc.nextLine();
			System.out.println("포인트를 입력> ");
			m1.point = Integer.parseInt(sc.nextLine());
			members[i] = m1;
		}

		// memberId 조회 후 point를 변경
		
			System.out.println("조회할 아이디를 입력하세요");
			String searchId = sc.nextLine();

			System.out.println("변경할 point를 입력하세요");
			int newPoint = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < members.length; i++) {
				if (members[i].memberId.equals(searchId)) {
					members[i].point = newPoint;

				}
			}
		
		// 출력======================================
		for (int i = 0; i < members.length; i++) {
			System.out.printf("아이디: %s , 이름: %s , 포인트: %d \n", members[i].memberId, members[i].memberName,
					members[i].point);
		}
	}

}
