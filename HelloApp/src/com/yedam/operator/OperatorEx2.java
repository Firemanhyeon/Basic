package com.yedam.operator;

import java.util.*;

public class OperatorEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
			thirdMethod(a,b);
			sc.close();
	}
	public static void thirdMethod(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void secondMethod() {
		Scanner sc =new Scanner(System.in);
		System.out.println("입력할 문자를 입력하세요");
		String a = sc.nextLine();
		System.out.println("출력할 횟수를 입력하세요");
		int b = sc.nextInt();
		for(int i =0;i<b;i++) {
			System.out.println(a);
		}
	}
	
	
	
	public static void firstMethod() {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double result = 0;
		result = Math.pow(a, b) ;
		System.out.println((int)result);
		
		int c = sc.nextInt();
		int d = sc.nextInt();
		int result1 = 1;
		for(int i=0; i<d ; i++) {
			result1 *= c;
		}
		System.out.println(result1);
		sc.close();
	}

}


