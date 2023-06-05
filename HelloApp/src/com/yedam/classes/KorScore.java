package com.yedam.classes;
//data : int[] : 필드 
//기능: 전체출력
//     합계
//     최대값
public class KorScore {
	//인스턴스필드
	int[]kor = new int [] {100,80,70};
	
	//생성자 기본생성자 KorScore(){}생성자를 따로 생성해주지않으면 기본생성자가 생성된다 
	//기본생성자:매개값이없는생성자를 기본생성자라고 한다. 
//	KorScore(int[] scores){
//		kor = scores;
//	}
	
	//static이 없는 메소드:인스턴스메소드
	public void print() {
		for(int score: kor) {
			System.out.println(score);
		}
	}
	public void total() {
		int sum=0;
		for(int score : kor) {
			sum+=score;
		}
		System.out.println(sum);
	}
	public void max() {
		int max = 0 ; 
		for(int score : kor) {
			if(max<score) {
				max = score;
			}
			
		}
		System.out.println(max);
	}
}
