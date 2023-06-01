package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		Bank[] accounts = new Bank[3];
		boolean run = true;
		int selectNo = 0;

		while (run) {
			System.out.println("1.등록 2. 조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택>");
			selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) { // 등록
				for (int i = 0; i < accounts.length; i++) {
					Bank b1 = new Bank();
					System.out.println("등록할 계좌번호를 적어주세요");
					String selectNum = sc.nextLine();
					if (i !=0) {
						boolean check = false;
						for(int a=0;a<i;a++) {
							if(accounts[a].accountNo.equals(selectNum)) {
								check=true;
								System.out.println("중복값입니다");
							}
						}
						if(check) {
							i--;
							continue;
						}
					}
						
						b1.accountNo = selectNum;
						System.out.println("예금주를 적어주세요");
						String selectWho = sc.nextLine();
						b1.owner = selectWho;
						System.out.println("잔고를 적어주세요");
						int selectMon = Integer.parseInt(sc.nextLine());
						b1.balance = selectMon;
					accounts[i] = b1;
				}

			} else if (selectNo == 2) { // 조회(계좌번호 //
				System.out.println("계좌번호조회 , 계좌번호를 입력하세요");
				String selectNum2 = sc.nextLine();
				boolean tun = false;
				for (int i = 0; i < accounts.length; i++) {
					if (selectNum2.equals(accounts[i].accountNo)) {
						System.out.println(accounts[i].owner+"님의 계좌잔액은 "+accounts[i].balance+"입니다");
						tun = true;
					}
				}
				if(tun==false) {
					System.out.println("등록되지않은 계좌번호입니다");
				}

			} else if (selectNo == 3) {// 입금
				System.out.println("입금하실 계좌번호를 입력해주세요");
				boolean tun1 = false;
				String selectNum3 = sc.nextLine();
				for(int i =0 ; i<accounts.length;i++) {
					if(selectNum3.equals(accounts[i].accountNo)) {
						System.out.println("입급하실 금액을 입력하세요");
						int selectMon1=Integer.parseInt(sc.nextLine());
						accounts[i].balance += selectMon1;
						tun1=true;
					}
				}
				if(tun1=false) {
					System.out.println("등록되지않은 계좌번호입니다");
				}

			} else if (selectNo == 4) {// 출금
				System.out.println("출금하실 계좌번호를 입력해주세요");
				boolean tun1 = false;
				String selectNum3 = sc.nextLine();
				for(int i =0 ; i<accounts.length;i++) {
					if(selectNum3.equals(accounts[i].accountNo)) {
						System.out.println("출금하실 금액을 입력하세요");
						int selectMon1=Integer.parseInt(sc.nextLine());
						accounts[i].balance -= selectMon1;
						tun1=true;
					}
				}
				if(tun1=false) {
					System.out.println("등록되지않은 계좌번호입니다");
				}

			} else if (selectNo == 5) {// 종료
				break;

			}
		}
		System.out.println("end of prog");
	}

}
