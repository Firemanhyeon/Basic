package com.yedam.reference;

public class referenceEx3 {

	public static void main(String[] args) {
		//학생점수: 89.5,78.9,90.4 값을 저장 sum , avg 구하기
		double[] score= {89.5, 78.9 ,90.4};
		double sum = 0;
		double maxVal=0;
		double minVal=score[0];
		for(int i = 0 ; i <score.length;i++) {
			sum+=score[i];
			if(maxVal<score[i]) {
				maxVal=score[i];
				
			}else if (minVal>score[i]) {
				minVal=score[i];
			}
		}
		System.out.println("총합:"+sum);
		System.out.println("평균:"+sum/3);
		System.out.println("최대값:" + maxVal);
		System.out.println("최소값:" + minVal);
	}

}
