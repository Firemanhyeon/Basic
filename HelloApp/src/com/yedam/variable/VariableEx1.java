package com.yedam.variable;

public class VariableEx1 {

	public static void main(String[] args) {
		//변수 :변하는 값을 저장하기위한 공간 
		//컴퓨터의 메모리에 저장공간에 값을 저장.
		int num1 ;//정수형 변수 선언 음의정수,0,양의정수 값을 담을 수 있는 int 
		num1 = 100;
		num1 = -100;
//		num1 = -1.2; X 실수라 안됨 
		double num2 = -1.2 ; //실수형 변수 선언 double 
		num2 = 12.3;
		num2 = 123; //값이 정수이지만 선언된 공간은 실수형이다 그런데도 허용되는이유는 내부적으로 형 변환이 이루어졌기 때문 .
		
		double result = 0 ; 
		result=(double)num1+num2 ;//오류 . num1과 num2 의 변수타입이 달라서 연산 불가능 
//		변수의 범위 int < double
//		int형 변수를 double로 바꿔주면 오류해결
		System.out.println("결과: "+result);
		
		// 변수의 종류 
		// 정수형 변수 : byte (1byte), short(2byte) , int(4byte), long(8byte)
		// 실수형 변수 : float(4byte) , double(8byte)
		// boolean : true / false 
		//객체 (클래스) : 문자형(String)
		//byte : 8bit -> 2*2*2*2*2*2*2*2 : -128~127
		//int 형 변수 범위 : -21억~~ , 0 , 21억
		byte b1 = 127;
		short s1 = 128;
		long l1 = 2147483648L;//인트 최댓값이 넘어가면 정수범위를 벗어났기때문에 뒤에 L붙여줘야함
		long result1 = (long)b1 + (long)s1+l1;
		System.out.println(result1);
		
		
	}

}
