package com.yedam.insa;

import java.util.Scanner;

public class EmpListApp {
//emplistapp: main()실행클래스
//	emplist: 사원정보 등록, 조회 ,출력
//	employee: 데이터의 입출력을 위한 정보
	public static void main(String[] args) {
		//싱글턴
//		EmpList app0 =EmpList.getInstance();
//		EmpList app1 =EmpList.getInstance();
//		EmpList app2 =EmpList.getInstance();
		//--------------------------------
		
		EmpList app = new EmpList();// emplist 클래스 불러오기
		Scanner sc = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {

			System.out.println("1.사원수등록 2.사원등록 3.사원목록 4. 검색 5.합계 6.종료");
			System.out.print("선택> ");

			selectNo = sc.nextInt();
			switch (selectNo) {

			case 1:
				app.init();
				break;
			case 2:
				app.input();
				break;
			case 3:
				app.print();
				break;
			case 4:
				System.out.println("조회할 사번을 입력하세요");
				int no = sc.nextInt();
				System.out.println(app.search(no));
				break;
			case 5:
				app.sum();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			}
		}
		System.out.println("프로그램이 종료");
		sc.close();
	}
}
