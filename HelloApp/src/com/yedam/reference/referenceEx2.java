package com.yedam.reference;

public class referenceEx2 {

	public static void main(String[] args) {
		int[] intAry = {30,40,50};
		double[] dblAry = { 30,40,50};
		String[] StrAry = { "H","E","L","L","O"};
//		배열의 크기는 한번 정해지면 바꿀 수 없다.
//		intAry[3]=33;//에러뜬다 3번방 없기때문.
		int sum =intAry[0]+intAry[1]+intAry[2];
		double sum1 =dblAry[0]+dblAry[1]+dblAry[2];
		
		int[] intAry2 = new int[3];//정수형변수를 넣을수있는새로운 배열공간을 생성
		intAry2[0] = 33;
		System.out.println(intAry2[0]);
		//확장 for문
		for(String str : StrAry) {
			System.out.println(str);
		}
		
		System.out.println(sum);
		System.out.println(sum1);

	}

}
