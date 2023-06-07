
package com.yedam.control;

import java.util.Scanner;

public class ControlEx3 {

	public static void main(String[] args) {
		
		String days ="Sun\tMon\tTue\tWed\tThr\tFri\tSat";
		
		System.out.println("월을 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		System.out.println(days);
		switch (month) {
		case 1:
			for(int i=1;i<=31;i++) {
				if(i%7==0) {
					System.out.printf("%d\n",i);
				}else {
					System.out.printf("%d\t",i);
				}
				
			}
		}
		
	}
	public static void method1() {
		for(int i = 0; i<10; i++) {
			if(i % 2 ==1) {
				System.out.printf( "%d",i);				
			}else {
				System.out.println("X");
			}
		}
	}
	
	public static void method2() {
		for(int num2 =1; num2 <=9; num2++) {
			int num1 = num2;  // outer for.
			for(int num =2; num <=9; num++) {
				System.out.printf("%d * %d = %d \t", num,num2,num1*num);
			}
			System.out.print("\n");
		}
	}
}