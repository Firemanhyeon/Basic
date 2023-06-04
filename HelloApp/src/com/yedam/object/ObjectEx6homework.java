package com.yedam.object;

import java.util.Scanner;

// 학생 정보관리 APP
// 1. 등록 2. 목록 3. 조회 (이름으로 조회)동일한이름이 있으면
// 그대로 여러명출력 4. 수정 점수만 수정가능 5. 삭제 학생정보 삭제
// 6.프로그램종료
// 학생정보 : 학생번호(23-001) / 이름 /성별 /점수 /
// student class 생성 후 필드 4개 타입별로 생성
// 학생번호 유무메소드
public class ObjectEx6homework {
	static Scanner sc = new Scanner(System.in);
	static Student[] accounts = new Student[3];

	public static void main(String[] args) {
		while (true) {

			System.out.println("1.등록 2.목록 3.조회 4.수정 5.삭제 6.프로그램종료");
			System.out.println("선택> ");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				register();
			} else if (select == 2) {
				list();
			} else if (select == 3) {
				search();
			} else if (select == 4) {
				modify();
			} else if (select == 5) {
				remove();
			} else if (select == 6) {
				break;
			}
		}

		// 메소드
		// 등록메소드 1. register()
		// 목록메소드 2. list() 남학생몇명인지 여학생 몇명인지 최고점수를 받은 점수와학생ex) 최고점수 : 이름 -100점
		// 조회메소드 3. search()
		// 수정메소드 4. modify()
		// 삭제메소드 5. remove()
		// 학생정보유무메소드

	}

	public static boolean checkAccount(String stuid) {
		boolean check = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getStudentid().equals(stuid)) {

				check = true;
				break;
			}
		}
		return check;
	}

	public static void register() {
		boolean run1 = true;
		while (run1) {

			System.out.println("학생번호를 입력하세요 ");
			String stuid = sc.nextLine();
			if (checkAccount(stuid)) {
				System.out.println("중복입니다");
				continue;
			} else {

				System.out.println("학생 이름을 입력하세요");
				String stuname = sc.nextLine();
				System.out.println("학생 성별을 입력하세요");
				String stugender = sc.nextLine();
				System.out.println("학생 점수를 입력하세요 ");
				int stuscore = Integer.parseInt(sc.nextLine());

				Student put = new Student();
				put.setStudentid(stuid);
				put.setName(stuname);
				put.setOx(stugender);
				put.setScore(stuscore);
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						accounts[i] = put;
						break;

					}
				}
				break;
			}

		}

	}

	public static void list() {
		int max = 0;
		String maxname = "";
		int man = 0;
		int wom = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {

				System.out.printf("학생번호: %s 학생이름: %s 남/여: %s 점수:%d\n", accounts[i].getStudentid(),
						accounts[i].getName(), accounts[i].getOx(), accounts[i].getScore());
				if (max < accounts[i].getScore()) {
					max = accounts[i].getScore();
					maxname = accounts[i].getName();
				}
				if (accounts[i].getOx().equals("남")) {
					man += 1;
				} else {
					wom += 1;
				}
			}
		}
		System.out.printf("\n최고점수받은학생 학생이름: %s 점수: %d \n  남학생: %d 여학생: %d\n", maxname, max, man, wom);
	}

	public static void search() {
		System.out.println("찾으실 학생번호를 입력하세요");
		String search = sc.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {

				if (checkAccount(search)) {
					System.out.printf("학생번호: %s 학생이름:%s 성별:%s 점수:%d\n", accounts[i].getStudentid(),
							accounts[i].getName(), accounts[i].getOx(), accounts[i].getScore());
				} else {
					System.out.println("찾으시는 학생이 없습니다");
				}
			}
		}
	}

	public static void modify() {
			for (int i = 0; i < accounts.length; i++) {
				System.out.println("수정할 학생 번호를 입력해주세요");
				String modstu = sc.nextLine();
				if (accounts[i] != null) {
					if (checkAccount(modstu)) {
						System.out.println("수정할 점수를 입력하세요");
						int newscor = Integer.parseInt(sc.nextLine());
						accounts[i].setScore(newscor);
						System.out.println("변경완료");
						break;
					} else {
						System.out.println("찾으시는 학생번호가 없습니다");
						i--;
					}
				}
			}
		}

	public static void remove() {
		for(int i =0; i < accounts.length;i++) {
			System.out.println("삭제할 학생 번호를 입력하세요");
			String removestu = sc.nextLine();
			if(accounts[i]!= null) {
				if(checkAccount(removestu)) {
					accounts[i]=null;
					System.out.println("삭제완료");
					break;
				}else {
					System.out.println("찾으시는학생버노가없습니다");
					i--;
				}
			}
		}
	}
	
	}
