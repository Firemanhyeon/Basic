package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6 {
	static Student[] accounts = new Student[3];
	static Scanner sc = new Scanner(System.in);
	// 학생 정보관리 APP
	// 1. 등록 2. 목록 3. 조회 (이름으로 조회)동일한이름이 있으면
	// 그대로 여러명출력 4. 수정 점수만 수정가능 5. 삭제 학생정보 삭제
	// 6.프로그램종료
	// 학생정보 : 학생번호(23-001) / 이름 /성별 /점수 /
	// student class 생성 후 필드 4개 타입별로 생성

	// 등록메소드
	public static void register() {
		System.out.println("학생 번호를 입력하세요");
		String stuid = sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("성별을 입력하세요 ");
		String ox = sc.nextLine();
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());

		Student student = new Student();
		student.setStudentid(stuid);
		student.setName(name);
		student.setOx(ox);
		student.setScore(score);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = student;
				System.out.println("정상적으로 등록");
				break;
			}
		}
	}

	// 목록메소드
	public static void list() {
		int max = 0;
		int man = 0;
		int wom = 0;
		String maxname = "";
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getOx().equals("남")) {
					man += 1;
				} else if (accounts[i].getOx().equals("여")) {
					wom += 1;
				}
				if (max < accounts[i].getScore()) {
					max = accounts[i].getScore();
					maxname = accounts[i].getName();
				}
				System.out.printf("학번 : %s 이름: %s 점수: %d \n",accounts[i].getStudentid(),accounts[i].getName(),accounts[i].getScore());
			}
		}
		System.out.printf("남학생 : %d 여학생 : %d , 최고점수: %s - %d \n", man, wom, maxname, max);
	}

	// 조회메소드
	public static void search() {
		System.out.println("이름을 입력해주세요");
		String account = sc.nextLine();
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getName().equals(account)) {
					System.out.printf("학생번호: %s 이름: %s 성별: %s 점수:%d \n", accounts[i].getStudentid(),
							accounts[i].getName(), accounts[i].getOx(), accounts[i].getScore());
					isExist = true;

				}
			}
			if (!isExist) {
				System.out.println("학생 정보가 없습니다");
			}
		}
	}
	//수정메소드
	public static void modify() {
		System.out.println("수정할 학생의 학생번호를 적어주세요");
		String account = sc.nextLine();
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getStudentid().equals(account)) {
					System.out.println("수정할 점수를 입력하세요");
					int account1 = Integer.parseInt(sc.nextLine());
					accounts[i].setScore(account1);
					System.out.println("수정완료했습니다");
					isExist = true;
				}
				if (isExist == false) {
					System.out.println("등록되지않은 학생번호입니다");
				}
			}
		}
	}
	//삭제메소드
	public static void remove() {
		System.out.println("삭제할 학생의 번호를 입력하세요");
		String account = sc.nextLine();
		boolean isExist=false;
		for(int i = 0 ; i <accounts.length; i++) {
			if(accounts[i] != null) {
				if(accounts[i].getStudentid().equals(account)) {
					accounts[i]=null;
					isExist = true; 
				}
			}
			if (isExist == false) {
				System.out.println("등록되지않은 학생번호입니다");
			}
		}
	}
	public static void main(String[] args) {
		// 메소드
		// 등록메소드 1. register()
		// 목록메소드 2. list() 남학생몇명인지 여학생 몇명인지 최고점수를 받은 점수와학생ex) 최고점수 : 이름 -100점
		// 조회메소드 3. search()
		// 수정메소드 4. modify()
		// 삭제메소드 5. remove()
		// 학생정보유무메소드
		boolean run = true;
		int selectNo = 0;
		while (run) {
			System.out.println("1.등록 2. 목록 3. 조회 4.수정 5.삭제 6.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				list();
			} else if (selectNo == 3) {
				search();
			} else if (selectNo == 4) {
				modify();
			} else if (selectNo == 5) {
				remove();
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다");
				run = false;
			}
		}

	}

}
