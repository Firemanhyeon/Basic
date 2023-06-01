package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {

	public static void main(String[] args) {
		//다차원배열
		//학생 3명 : 홍길동의 영어수학점수 , 김길동의 영어수학점수 , 박길동의 영어수학점수
		int[][]intAry= {//
					new int[] {80,90},//홍길동
				    new int[] {85,95},//김길동
				    new int[] {70,80}//박길동
				};
		int sum = 0;
		int sum1=0;
		int total=0;
		System.out.println("홍길동의 영어점수: "+intAry[0][0]);
		System.out.println("홍길동의 수학점수: "+intAry[0][1]);
		System.out.println("김길동의 영어점수: "+intAry[1][0]);
		System.out.println("홍길동의 수학점수: "+intAry[1][1]);
		System.out.println("박길동의 영어점수: "+intAry[2][0]);
		System.out.println("박길동의 영어점수: "+intAry[2][1]);
		//학생들의 영어점수 합계
//		for(int i = 0 ; i < intAry.length;i++) {
//			 sum += intAry[i][0];
//		}
//		System.out.println("영어점수합계: "+ sum);
//		
//		 sum = intAry[0][0]+intAry[1][0]+intAry[2][0];
//		System.out.println("영어점수합계: "+ sum);
		//학생들의 수학점수 합계
//		for(int i = 0 ; i<intAry.length;i++) {
//			sum1+= intAry[i][1];
//			
//		}
//		System.out.println("수학점수합계: "+ sum1);
		
		// 총합점수
		for(int i =0; i<intAry.length;i++) {
			sum += intAry[i][0];
			sum1+= intAry[i][1];
			for(int j =0 ; j < intAry.length-1 ; j++) {
				total += intAry[i][j];
			}
		}
		System.out.println("영어점수합계: "+ sum);
		System.out.println("수학점수합계: "+ sum1);
		System.out.println("영어수학점수 합계: " +total);
		String[]nameAry = {"홍길동","김길동","박길동"};
//		===================원하는 이름을 입력하고 그 이름의 영어점수 수학점수출력 없으면 없다고출력===========================
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		boolean isExist = false;
		for(int i = 0 ; i<nameAry.length;i++) {
			if(nameAry[i].equals(name)) {
				System.out.printf("%s의 영어점수는 %d , 수학점수는 %d ", nameAry[i],intAry[i][0],intAry[i][1]);
				isExist = true;
			}
			}
		if(isExist == false) {
				System.out.println("찾으시는 이름이 명단에 없습니다");
		}
		
//		==================원하는 이름을 입력하고 그 이름의 영어점수 수학점수출력 없으면 없다고출력=========================
//		int d = 0;
//		if(name.equals("홍길동")) {
//			d=0;
//			System.out.printf("%s의 영어점수는 %d , 수학점수는 %d ", nameAry[d],intAry[d][0],intAry[d][1]);
//		}else if ( name.equals("김길동")) {
//			d=1;
//			System.out.printf("%s의 영어점수는 %d , 수학점수는 %d ", nameAry[d],intAry[d][0],intAry[d][1]);
//		}else if (name.equals("박길동")) {
//			d=2;
//			System.out.printf("%s의 영어점수는 %d , 수학점수는 %d ", nameAry[d],intAry[d][0],intAry[d][1]);
//		}else {
//			System.out.println("찾으시는 이름이 명단에 없습니다");
//		}
//		===================================================
//		for(int i = 0 ; i<nameAry.length;i++) {
//			System.out.printf("%s의 영어점수는 %d , 수학점수는 %d ", nameAry[i],intAry[i][0],intAry[i][1]);
//			System.out.println();
//		}
		
} 
}


