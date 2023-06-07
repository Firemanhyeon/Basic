package com.yedam.control;

public class ControlEx4 {

	public static void main(String[] args) {
		//1부터 100까지 수중에서 3의 배수의 합계. 메소드1
		// math.random() 2번 실행 => 두수의 합이 5가 될때 반복회수를 중단 method2
		//반복문 for를활용해서 별찍기
//		method1();
//		method2();
		method4();

	}
	public static void method1() {
		int a = 0;
		for(int i =1;i<=100;i++) {
			if(i%3==0) {
				a+=i;
			}
		}
		System.out.println("1부터 100까지의 3의배수의합계:"+a);
		
	}
	public static void method2() {
		
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			if(a+b==5) {
				System.out.println(a+"+"+b+"="+ (a+b) ) ;
				break;
			}
			else {
				System.out.println(a+"+"+b+"="+ (a+b) ) ;
				
			}
			
		}
	}
	public static void method3() {
		for(int i =1; i<=4;i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public static void method4() {
		for(int i = 1; i <=4; i++) {
			for(int j = 4; j>=i ; j--) {
				System.out.print(" ");
			}for(int k =1 ; k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i = 1; i<=4 ; i++) {
			for(int j=1;j<=4;j++) {
				if(i<=j) {
					System.out.printf("%s","*");
				}else {
					System.out.printf("%s"," ");
				}
			}System.out.println();
			}
	}

}
