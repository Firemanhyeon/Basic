package com.yedam.reference;

import java.util.Arrays;
import java.util.Scanner;

public class ReferenceEx7 {

	public static void main(String[] args) {
		//학생수  => 점수 입력 점수 출력 ,최고점수 ,평균점수
		Scanner sc = new Scanner(System.in);
		int student = 0;
		int[] scores= {};
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.학생수입력 2.점수입력 3.점수리스트 4.분석(최고점수,평균) 5.종료");
			System.out.println("-------------------------");
			int selectNo=Integer.parseInt(sc.nextLine());
			int sum = 0 ;
			
			if(selectNo == 1 ) {
				System.out.println("학생수를 입력하세요.");
				student = Integer.parseInt(sc.nextLine());
				if(selectNo == 0) {
					System.out.println("잘못 입력했습니다");
				}
				selectNo=0;
				continue;
				
				
			}else if( selectNo==2) {//배열의 크기만큼 학생의 점수
				scores = new int[student];
				
				if(student == 0) {
					System.out.println("학생 수를 입력하세요");
					continue;
				}
				System.out.println("점수를 입력하세요");
				for(int i =0; i<student;i++) {
					
					scores[i]=Integer.parseInt(sc.nextLine());
				}
				
			}else if( selectNo==3) {//배열의 점수 출력
				if(student == 0) {
					System.out.println("학생 수를 입력하세요");
					continue;
				}
				for(int i = 0; i<scores.length;i++) {
					System.out.println("점수: "+scores[i]);
				}
				
			}else if( selectNo==4) {//
				int max =scores[0];
				if(student == 0) {
					System.out.println("학생 수를 입력하세요");
					continue;
				}
				for(int i=0;i<scores.length;i++) {
					if(max <scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고점수: " +max);
				for(int i=0;i<scores.length;i++) {
					sum += scores[i];
				}System.out.println("평균: " +(double)sum/student);
				
				
			}else if( selectNo==5) {
				break;		
			}
		}
		System.out.println("end of prog");
		}
	public static void method1() {
		//학교의 키 a반(2명) b반(4명) c반(3명) 
		//각 반별로 키의 평균
		double [][] heightAry = {
				{173.5,168.3},//a반
				{176.5,162.2,190.3,188.3},//b반
				{176.0,156.0,161.0}//c반
				};
		String[] ban = {"a","b","c"}; 
		double sum = 0;
		double avg = 0;
		for(int i = 0 ; i <heightAry.length;i++) {
			for(int j = 0 ; j <heightAry[i].length;j++) {
				sum += heightAry[i][j];
				avg = sum/heightAry[i].length;
			}
			System.out.println(ban[i]+"반의 평균: "+avg);
			sum=0;
			avg=0;
		}
	}
}

	


