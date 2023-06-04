package com.yedam.object;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
//		q1
//		for(int i =0 ; i < arr1.length;i++) {
//			if(arr1[i]==60) {
//				System.out.println(i);
//			}
//		}
//		q2
//		for(int i =0 ; i < arr1.length;i++) {
//			if(i!=3) {
//				System.out.println(arr1[i]);
//			}
//		}
//		q3
//		Scanner sc = new Scanner(System.in);
//		int change= sc.nextInt();
//		arr1[change] = 1000;
//		for(int i = 0 ; i < arr1.length;i++) {
//			
//			System.out.println(arr1[i]);
//		}
//		q4
//		int max = 0 ; 
//		int min = arr1[0];
//		for(int i = 0 ; i <arr1.length;i++) {
//			if(max <arr1[i]) {
//				max=arr1[i];
//			}
//			if(min>arr1[i]) {
//				min=arr1[i];
//			}
//		}
//		System.out.println("최댓값:"+max+"최소값"+min);
//		q5
//		int a[] = new int[10];
//		for(int i = 0;i<a.length;i++) {
//			int b = (int)(Math.random()*100);
//			a[i]=b;
//			
//			if(a[i]%3==0) {
//				System.out.println("3의배수"+a[i]);
//						
//			}
//		}
//		System.out.println("학생수를 입력하세요");
//		Scanner sc = new Scanner(System.in) ;
//		int stu = sc.nextInt();
//		int score[] = new int [stu];
//		int min=100;
//		int max = 0;
//		double sum = 0;
//		double avg = 0;
//		for(int i = 0 ; i <stu;i++) {
//			System.out.println("점수를 입력하세요");
//			int scor = sc.nextInt();
//			score[i]= scor;
//		}
//		for(int i = 0 ; i < stu ; i++) {
//			if(min>score[i]) {
//				min=score[i];
//			}
//			if(max<score[i]) {
//				max = score[i];
//			}
//			sum+=score[i];
//		}
//		avg = (double)sum/stu;
//		System.out.printf("최고점수 %d , 최저점수 %d 평균 %.2f",max,min,avg);
//			
//		
//		
//		
//		boolean run = true;
//		int stunum = 0; 
//		int stuscor[]= null;
//		Scanner sc = new Scanner(System.in);
//		while(run) {
//			System.out.println("--------------------------------------------");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//			System.out.println("--------------------------------------------");
//			System.out.println("선택> ");
//			int selectNo = sc.nextInt();
//			switch(selectNo) {
//			case 1:
//				System.out.println("학생수를 입력하세요");
//				stunum = sc.nextInt();
//				stuscor = new int[stunum];
//				break;
//			case 2: 
//				for(int i = 0 ; i<stunum;i++) {
//					System.out.println("점수를 입력하세요");
//					int stuscore=sc.nextInt();
//					stuscor[i]=stuscore;
//				}
//				break;
//			case 3:
//				for(int i =0;i<stuscor.length;i++) {
//					System.out.println((i+1)+"번학생의 점수:"+stuscor[i]);
//				}
//				break;
//			case 4:
//				int max=0;
//				int min=100;
//				int sum=0;
//				double avg=0;
//				for(int i = 0 ; i< stuscor.length;i++) {
//					if(max<stuscor[i]) {
//						max = stuscor[i];
//					}
//					if(min>stuscor[i]) {
//						min = stuscor[i];
//						
//					}
//					sum+=stuscor[i];
//				}
//				avg = sum/stunum;
//				System.out.println("최고점수: "+max);
//				System.out.println("최저점수: "+min);
//				System.out.println("평균: "+avg);
//				break;
//				
//			case 5: 
//				run = false;
//				System.out.println("프로그램을 종료합니다");
//			}
//				
//		}
		
	}
		

}
