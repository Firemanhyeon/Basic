package com.yeda.control;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
//		12월
//		메소드를 사용해 마지막 날짜값을 출력으로 나오게 1=>31 , 2=>28 3=>31, 4=>30
		
		System.out.println(getLastDate());
	}
//	public static = 메소드를 만들기위해 반드시 붙여야하는 키워드 
	public static String getLastDate() {
		System.out.println("날짜를 입력해 주세요");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		
		int result = 0;
		String result1 = "";
		switch(a) {
		case 1,3,5,7,8,10,12:
			result = 31;
			result1=a+"의 마지막 날은"+result+"입니다";
			break;
		case 4,6,9,11:
			result = 30;
			result1=a+"의 마지막 날은"+result+"입니다";
			break;
		default:
			result = 28;
			result1=a+"의 마지막 날은"+result+"입니다";
		}	
		return result1;
	}
//	반환되는값과 입력하는값의 타입을 선언해줘야함
	public static void method1() {
		int result = (int)(Math.random()*3)+1;
		switch(result) {
		case 1 : 
			System.out.println("가위");
			break;
		case 2 : 
			System.out.println("바위");
			break;
		case 3 : 
			System.out.println("보");
			break;
		}
	}

}
