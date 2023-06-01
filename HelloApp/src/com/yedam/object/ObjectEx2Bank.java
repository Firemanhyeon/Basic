package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//
		Bank [] accounts = new Bank[3];
		boolean run = true;
		int selectNo=0;
		
		while (run) {
			System.out.println("1.등록 2. 조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택>");
			 selectNo=Integer.parseInt(sc.nextLine());
			 
			 if(selectNo ==1 ) { //등록
				 
				 System.out.println("등록할 계좌번호를 적어주세요");
				 String selectNum=sc.nextLine();
				 for(int i=0;i<accounts.length;i++) {
					 Bank b1 = new Bank();
					 if(accounts[i]==null) {
						 b1.acoounts.=selectNum;
					 }
				 }
				 
				 
			 } else if (selectNo ==2) { //조회(계좌번호 //
				 
			 } else if(selectNo==3) {//입금
				 
			 } else if(selectNo==4) {//출금
				 
			 }else if(selectNo==5) {//종료
				 
			 }
		}
		System.out.println("end of prog");
	}

}
