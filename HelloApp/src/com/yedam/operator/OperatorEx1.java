package com.yedam.operator;
import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		//메소드 : 함수인데 객체(Object)에 소속되어 있는 메소드
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
//		int result = sc.nextInt();//함수가 객체에 소속되어있는것을 메소드
//		System.out.println("입력값은 " +result+"입니다");
//		sc.close();//resource 환원 . 
//		
		//문자열 입력받기 = String str - scn.nextLine();
//		문제1
//		사용자의 값을입력받아서 두 합 구하기 num1 num2
//		int num1 = sc.nextInt();
//		int num2= sc.nextInt();
//		int result1 = 0;
//		String num3 ="";
//		for(int i = num1; i<=num2;i++) {
//			result1 +=i;
//			if(i!=num2) {
//				num3 += i+"+" ;
//			}else {
//				num3 +=i +"=";
//			}
//			
//		}
//		System.out.println(num3+result1);
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int result1=0;
		if(num3<num4) {
			
			for(int i=num3 ; i<=num4 ; i++) {
				if(i%2==0) {
					result1+=i;
				}
			}
			System.out.println(result1);
		}else {
			for(int i=num4 ; i<=num3 ; i++) {
				if(i%2==0) {
					result1+=i;
				}
			}
			System.out.println(result1);
		}

		}

}
