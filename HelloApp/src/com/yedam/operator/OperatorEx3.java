package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {

	public static void main(String[] args) {
		//변수 balance 선언.
		//balanc가 0~100,000 범위 내에서만 추가 , 차감이 되도록
		//입력값을 판단 1이라는값이 들어오면 balance 값을 추가 . 2라는값이 들어오면 balace 값을 빼기
		//3번값들어오면 현재 balance값 출력 4번값 들어오면 종료
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("1)추가 2) 차감 3) balance 출력 4) 종료");
			int menu = sc.nextInt();
			if(menu==1){
				System.out.println("추가할 값을 입력하세요");
				int b = sc.nextInt();
				if(balance+b<100000) {
					balance += b;
				}else {
					System.out.println("허용범위를 초과했습니다");
				}
				
			}else if(menu==2) {
				System.out.println("차감할 값을 입력하세요");
				int b = sc.nextInt();
				if(balance-b>0) {
					balance -= b;
				}else {
					System.out.println("허용범위를 초과했습니다");
				}
			}else if(menu==3) {
				System.out.println(balance);
			}else if(menu==4) {
				break;
			}else {
				System.out.println("잘못된입력입니다");
			}
		}
		System.out.println("end of prog");

	}
	
//	method1
	public static void method1() {
		//반복처리 while 
		int num1 = 1;
		while(num1 <= 10) {
			System.out.println(num1++);
		}
		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while(isOK) {
			System.out.println(num1++);
			if(num1>= 10) {
				isOK=false;
			}
						
		}
		Scanner sc = new Scanner(System.in);
		isOK=true;
		while(isOK) {
			System.out.println("문장을 입력하세요");
			String str = sc.nextLine();
			
			if(str.equals("quit")) {
				isOK=false;
				break; //while문 탈출
			}
			System.out.println("입력값은"+str+"입니다.");
			
		}
		System.out.println("end of prog.");
	}
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡmethodㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
}
