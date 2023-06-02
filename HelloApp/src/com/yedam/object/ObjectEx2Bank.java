package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	static Bank[] accounts = new Bank[3];//static 붙여야 생성자선언없이 바로 사용가능 
	static Scanner sc = new Scanner(System.in);
	
//	public static void printAry() {
//		for(Bank bank : accounts) {
//			System.out.println(bank.getAccountNo());
//		}
//	}
	//조회계좌정보가 유무.
	public static boolean checkAccount(String accountNo){
		boolean isExist  = false;
		for(int i = 0 ; i < accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getAccountNo().equals(accountNo)) {
				isExist =true;
				break;
			}
		}
		return isExist;
	}
	//계좌등록
	public static void registerAccount() {
		for (int i = 0; i < accounts.length; i++) {
			Bank b1 = new Bank();
			System.out.println("등록할 계좌번호를 적어주세요");
			String selectNum = sc.nextLine();
			if (i != 0) {
				boolean check = false;
				for (int a = 0; a < i; a++) {
					if (accounts[a].getAccountNo().equals(selectNum)) {
						check = true;
						System.out.println("중복값입니다");
					}
				}
				if (check) {
					i--;
					continue;
				}
			}

			b1.setAccountNo(selectNum);
			System.out.println("예금주를 적어주세요");
			String selectWho = sc.nextLine();
			b1.setOwner(selectWho);
			System.out.println("잔고를 적어주세요");
			int selectMon = Integer.parseInt(sc.nextLine());
			b1.setBalance(selectMon);
			accounts[i] = b1;

		}
	}
	//계좌정보 조회 메소드
	public static void searchAccount() {
		System.out.println("계좌번호조회 , 계좌번호를 입력하세요");
		String selectNum2 = sc.nextLine();
		checkAccount(selectNum2);
		if(checkAccount(selectNum2)!=true) {
			System.out.println("찾는계좌정보가 없습니다");
		}else {
			
		}
//		boolean tun = false;
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null && selectNum2.equals(accounts[i].getAccountNo())) {
//				System.out.println(accounts[i].getOwner() + "님의 계좌잔액은 " + accounts[i].getBalance() + "입니다");
//				tun = true;
//			}
//		}
//		if (tun == false) {
//			System.out.println("등록되지않은 계좌번호입니다");
//		}

	}
	//입금 메소드
	public static void dsposit() {
		System.out.println("입금하실 계좌번호를 입력해주세요");
		boolean tun1 = false;
		String selectNum3 = sc.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && selectNum3.equals(accounts[i].getAccountNo())) {
				System.out.println("입급하실 금액을 입력하세요");
				int selectMon1 = Integer.parseInt(sc.nextLine());
				accounts[i].setBalance(accounts[i].getBalance() + selectMon1);
				tun1 = true;
			}
		}
		if (tun1 == false) {
			System.out.println("등록되지않은 계좌번호입니다");
		}
	}
	//출금 메소드
	public static void chull() {
		System.out.println("출금하실 계좌번호를 입력해주세요");
		boolean tun1 = false;
		String selectNum3 = sc.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && selectNum3.equals(accounts[i].getAccountNo())) {
				System.out.println("출금하실 금액을 입력하세요");
				int selectMon1 = Integer.parseInt(sc.nextLine());
				accounts[i].setBalance(accounts[i].getBalance() - selectMon1);
				tun1 = true;
			}
		}
		if (tun1 == false) {
			System.out.println("등록되지않은 계좌번호입니다");
		}

	}
	public static void main(String[] args) {
		//
		boolean run = true;
		int selectNo = 0;

		while (run) {
			System.out.println("1.등록 2. 조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택>");
			selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) { // 등록
				registerAccount();
			} else if (selectNo == 2) { // 조회(계좌번호 //
				searchAccount();
			} else if (selectNo == 3) {// 입금
				dsposit();
			} else if (selectNo == 4) {// 출금
				chull();
			} else if (selectNo == 5) {// 종료
				break;

			}
		}
		System.out.println("end of prog");
	}

}
