package com.yedam.classes;

public class Calculator {
	//고정적으로 2개의 값을 가져와 연산을 하는 계산기같은 경우엔 인스턴스를 만들 필요 없이 static 사용하면됨
	//인스턴스마다 동일한 값
	static final double PI=3.14;//상수 변하지않는수
	//계산기 연산기능 메소드
	public static void sum(int num1,int num2) {
		int result = num1+num2;
		System.out.println("더한결과: "+ result);
	}
	public static void minus(int num1,int num2) {
		int result = num1-num2;
		System.out.println("뺀결과: "+ result);
	}
	public static void getArea(int radius) {//원의넓이
		double result = PI*radius*radius;
		System.out.println("원의넓이:"+result);
	}
	

}
